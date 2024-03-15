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
    
    public boolean winFor(Cell player) {
        // to complete
        return false; 
    }
}