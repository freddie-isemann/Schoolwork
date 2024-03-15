enum Cell {
    X, O, Empty
}
class Grid {
    private int m, n;
    private Cell[][] cs;

    Grid(int m, int n) {
        cs = new Cell[m][n];

        // initialise the grid with empty cells
        for(Index i : Index.upTo(m, n)) {
                cs[i.row][i.column]=Cell.Empty;
        }

        this.m = m;
        this.n = n;
    }
    Grid() {
        this(3,3);
    }
    public Cell get(Index i) {
        if(i.row < m && i.column < n) return cs[i.row][i.column];
        return null;
    }
    public void set(Cell c, Index i) {
        if(i.row < m && i.column < n) cs[i.row][i.column] = c;
    }

    private String cell_to_str(Cell c) {
        switch(c) {
            case X: return "X";
            case O: return "O";
            case Empty: return "_";
        }
        return "";
    }
    public String toString() {
        String r = "";
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                r += cell_to_str(get(new Index(i,j))) + " ";
            }
            r += "\n"; 
        }
        return r; 
    }
    public Index[][] getVerticals(int k) {
        // to complete
        return null;
    }
}
