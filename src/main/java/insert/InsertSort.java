package insert;

import java.util.Arrays;

import static utils.UtilSwap.swap;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * O(n^2)
 * Алгоритм в котором элементы входной последовательности просматриваются по одному, и каждый новый поступивший элемент
 * размещается в подходящее место среди ранее упорядоченных элементов
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] ints = {2, 15, 2, 51, 6};
        insert(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void insert(int[] array) {
        for (int i = 1; i < array.length; i++) {//let's consider firts element to be sorted
            for (int j = i; j > 0; j--) { // compare to already sorted elements
                if (array[j] < array[j-1]) {
                    swap(array,j, j-1);
                }
            }
        }
    }
}
