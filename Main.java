import java.lang.reflect.Array;
import java.util.Arrays;

public static int[] filterEvenIndexOddValue(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (i % 2 == 0 && array[i] % 2 != 0) {
            count++;
        }
    }
    int[] result = new int[count];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
        if (i % 2 == 0 && array[i] % 2 != 0) {
            result[index++] = array[i];
        }
    }
    return result;
}

public void main() {
    int[] array = new int[]{1, 2, 3, 4, 5, 6};
    int[] result = filterEvenIndexOddValue(array);
    System.out.println(Arrays.toString(result));
}
