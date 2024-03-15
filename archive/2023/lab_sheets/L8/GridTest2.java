class GridTest2 {
    public static void main(String[] args) {
        Grid g = new Grid(3,3); 
        String toPrint = ""; 

        for(Index[] is : g.getVerticals(2)) {
            for(Index i : is) 
                toPrint += i + ",";
            toPrint += "\n";
        }
        System.out.print(toPrint);
    }
}