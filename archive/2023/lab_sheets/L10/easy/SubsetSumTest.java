import java.util.Arrays;

class SubsetSumTest {
    public static void main(String[] args) {
        System.out.println(SubsetSum.ssSum(5, Arrays.asList(1,2,3)));
        System.out.println(SubsetSum.ssSum(1, Arrays.asList(1,2,3)));
        System.out.println(SubsetSum.ssSum(6, Arrays.asList(1,2,3)));
        System.out.println(SubsetSum.ssSum(4, Arrays.asList(2,3)));
    }
}