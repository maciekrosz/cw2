public class Main {
    public static int[] filterEvenIndexOddValue(int[] array){
    int counter = 0;
    for(int i = 0; i < array.length; i++){
        if(array[i] % 2 == 0){
            counter++;
        }
    int[] result = new int[counter];
        for(int j = 0; j < counter; j++){
            result[j] = array[i];
        }
    return result;
    }
    }
}
