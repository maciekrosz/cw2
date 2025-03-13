public class Main {

    public static int findDominant(int[] array) {
        int n = array.length;
        if (n == 0) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {3, 3, 3, 2, 2};
        System.out.println(findDominant(array));
    }
}
