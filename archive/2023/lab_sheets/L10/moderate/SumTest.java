import java.util.*;
class SumTest {
    public static void main(String[] args) {
        List<Integer> xs = new ArrayList<>(Arrays.asList(2,3,15,0,-1,4));
        Set<Integer> is = new HashSet<>(Arrays.asList(0,2,3));
        System.out.println("The sum of elements of :");
        System.out.println(xs);
        System.out.println("at indices:");
        System.out.println(is);
        System.out.printf("is: %d\n", SubsetSum.sum(xs,is));

        // ...

        System.out.println("-------");
        is = new HashSet<>(Arrays.asList(1,3,4,5));
        System.out.println("While the sum at indices:");
        System.out.println(is);
        System.out.printf("is: %d\n", SubsetSum.sum(xs,is));
    }
}