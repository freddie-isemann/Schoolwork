class PositionTest {

    static private void checkWin(Position p, Cell player) {
        System.out.println("This position is a win for " + player + "?");
        System.out.println(p);
        System.out.println("Answer: " + p.winFor(player));
    }
    public static void main(String[] args) {
        Position p = new Position();        

        checkWin(p, Cell.X);

        p.getGrid().set(Cell.X, new Index(0,0));
        p.getGrid().set(Cell.X, new Index(1,1));
        p.getGrid().set(Cell.X, new Index(2,2));
        checkWin(p, Cell.X);

        p = new Position();
        p.getGrid().set(Cell.X, new Index(0,0));
        p.getGrid().set(Cell.X, new Index(2,2));
        
        p.getGrid().set(Cell.O, new Index(0,1));
        p.getGrid().set(Cell.O, new Index(1,1));
        p.getGrid().set(Cell.O, new Index(2,1));
        checkWin(p, Cell.O);
    }
}