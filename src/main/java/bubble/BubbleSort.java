package bubble;

import java.util.Arrays;

import static utils.UtilSwap.swap;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * O(n^2)
 * За каждый проход элементы последовательно сравниваются попарно и, если порядок в паре неверный, выполняется обмен элементов.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = {3, 4, 1, 51, 5, 2};
        bubble(ints);
        System.out.println(Arrays.toString(ints));
    }
    private static void bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1] > array[j]) {
                    swap(array, j-1, j);
                }
            }// by the end of loop max element in the end
        }
    }

}
