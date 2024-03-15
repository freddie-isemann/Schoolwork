class IndexTest {
    public static void main(String[] args) {
        for(Index i : Index.upTo(3, 2)) {
            System.out.println(i);
        }
    }
}