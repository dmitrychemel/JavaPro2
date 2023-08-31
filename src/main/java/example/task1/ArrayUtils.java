package example.task1;

public class ArrayUtils {

    public static int[] getArrayBySize(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }

        return result;
    }
}
