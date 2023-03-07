import java.util.Arrays;

public class Main19_62 {

    public static int[] findParallelValues(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                result[count++] = arr1[i];
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }
}