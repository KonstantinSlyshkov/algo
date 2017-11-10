package utils;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 */
public class UtilSwap {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
