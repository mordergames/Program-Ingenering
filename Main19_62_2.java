import java.util.Arrays;

public class Main19_62_2 {

    public static void main(String[] args) {
        int[] arr1 = {4, 6, 7, 2, 5, 3};
        int[] arr2 = {5, 6, 2, 2, 4, 3};
        int[] result = Main19_62.findParallelValues(arr1, arr2);
        System.out.println(Arrays.toString(result)); // [6, 2, 3]
    }
}