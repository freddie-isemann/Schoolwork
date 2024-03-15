class Position {
    private Grid g;
    private int k; 
    private int m,n;

    Position(int m, int n, int k, Grid grid) {
        g = grid; 
        this.k = k;
        this.m = m;
        this.n = n;
    }
    Position(int m, int n, int k) {
        this(m,n,k, new Grid(m,n));
    }
    Position() {
        this(3,3,3);
    }

    public Grid getGrid() { 
        return g; 
    }

    public String toString() {
        return g.toString();
    }

    private boolean winningLine(Cell player, Index[] line) {
        boolean b = true;
        for(Index i : line) {
            if(g.get(i) != player)
                b = false;
        }
        return b; 
    }
    public boolean winFor(Cell player) {
        if(player == Cell.Empty) return false; 

        for(Index[] is : g.getHorizontals(k)) {
            if(winningLine(player, is)) return true;
        }
        for(Index[] is : g.getVerticals(k)) {
            if(winningLine(player, is)) return true;
        }
        for(Index[] is : g.getDiagonals(k)) {
            if(winningLine(player, is)) return true;
        }
        for(Index[] is : g.getAdiagonals(k)) {
            if(winningLine(player, is)) return true;
        }
        return false; 
    }
}