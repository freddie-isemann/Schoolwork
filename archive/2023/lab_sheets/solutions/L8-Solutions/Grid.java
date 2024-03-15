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

    public Index[][] getHorizontals(int k) {
        // Every line is of length 'k', but how many horizontal lines are there? 
        // To simplify matters just put a safe number like n*m 
        // there cannot be more lines than this. 
        Index[][] temporary = new Index[n*m][k];

        // count how many horizontal lines we have found
        int count = 0;
    
        // for each index in the grid, check whether there is a horizontal line
        // to the right
        for(Index i : Index.upTo(m, n)) {
            // by by going 'k' steps to the right do we get out of bounds?
            if(i.column + k <= n) {
                for(int l=0; l<k ; l++)
                    temporary[count][l] = new Index(i.row, i.column + l);
                count++;
            }
        }
        
        // Make an array 'ret' of the right size, and just copy the elements
        Index[][] ret = new Index[count][k];
        for(Index i : Index.upTo(count, k)) {
            ret[i.row][i.column] = temporary[i.row][i.column];
        }
        return ret;
    }
    public Index[][] getVerticals(int k) {
        // Every line is of length 'k', but how many horizontal lines are there? 
        // To simplify matters just put a safe number like n*m 
        // there cannot be more lines than this. 
        Index[][] temporary = new Index[n*m][k];

        // count how many horizontal lines we have found
        int count = 0;
    
        // for each index in the grid, check whether there is a horizontal line
        // to the right
        for(Index i : Index.upTo(m, n)) {
            // by by going 'k' steps to the right do we get out of bounds?
            if(i.row + k <= m) {
                for(int l=0; l<k ; l++)
                    temporary[count][l] = new Index(i.row+l, i.column);
                count++;
            }
        }
        
        // Make an array 'ret' of the right size, and just copy the elements
        Index[][] ret = new Index[count][k];
        for(Index i : Index.upTo(count, k)) {
            ret[i.row][i.column] = temporary[i.row][i.column];
        }
        return ret;
    }

    public Index[][] getDiagonals(int k) {
        Index[][] temporary = new Index[n*m][k];
        int count = 0;
        for(Index i : Index.upTo(m, n)) {
            if(i.row + k <= m && i.column +k <= n) {
                for(int l=0; l<k ; l++)
                    temporary[count][l] = new Index(i.row+l, i.column+l);
                count++;
            }
        }

        Index[][] ret = new Index[count][k];
        for(Index i : Index.upTo(count, k)) {
            ret[i.row][i.column] = temporary[i.row][i.column];
        }
        return ret;
    }
    public Index[][] getAdiagonals(int k) {
        Index[][] temporary = new Index[n*m][k];
        int count = 0;
        for(Index i : Index.upTo(m, n)) {
            if(i.row + k <= m && i.column - k >= -1) {
                for(int l=0; l<k ; l++)
                    temporary[count][l] = new Index(i.row+l, i.column-l);
                count++;
            }
        }

        Index[][] ret = new Index[count][k];
        for(Index i : Index.upTo(count, k)) {
            ret[i.row][i.column] = temporary[i.row][i.column];
        }
        return ret;
    }
}
