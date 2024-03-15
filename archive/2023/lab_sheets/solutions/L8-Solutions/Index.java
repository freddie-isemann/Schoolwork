class Index {
    public int row;
    public int column; 
    Index(int i, int j) {
        row = i;
        column = j;
    }

    static Index[] upTo(int m, int n) {
        Index[] is = new Index[m*n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                is[i*n + j] = new Index(i,j);
            }
        }
        return is;
    }

    public String toString() {
        return "(" + row + ", " + column + ")";
    }
}