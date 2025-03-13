import java.util.Arrays;
public class Main {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0 || positions == 0 || positions % n == 0) {
            return array;
        }
        positions = positions % n;
        int temp;
        for (int i = 0; i < positions; i++) {
            temp = array[n - 1];
            for (int j = n - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int positions = 2;
        int[] rotatedArray = rotateArray(array, positions);
        System.out.println(Arrays.toString(rotatedArray));

    }
}

