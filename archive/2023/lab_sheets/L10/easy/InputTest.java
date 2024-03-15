class InputTest {
    public static void main(String[] args) {
        SubsetSum s = new SubsetSum();
        s.readInstances();
        System.out.println("We have the following instances: ");
        for(Instance i : s.getInstances()) {
            System.out.printf("Of size %d: \n", i.k);
            System.out.println(i.c);
            System.out.println("--------");
        }
    }
}