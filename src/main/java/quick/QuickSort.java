package quick;

import java.util.Arrays;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * O(n^2) - O(n log n)
 * Выбрать из массива элемент, mid
 * Сравнить все остальные элементы с опорным и переставить их в массиве так, «меньшие опорного», «равные» и «большие».
 * Для отрезков «меньших» и «больших» значений выполнить рекурсивно ту же последовательность операций
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {2, 41, 1, 5, 2, 5};
        quick(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }


    public static void quick(int[] array, int startIdx, int endIdx) {
        int idx = initialPartition(array, startIdx, endIdx);
        if (startIdx < idx - 1) {
            // Recursively call quicksort with left part of the partitioned array
            quick(array, startIdx, idx - 1);
        } if (endIdx > idx) {
            // Recursively call quick sort with right part of the partitioned array
            quick(array, idx, endIdx);
        }

    }

    private static int initialPartition(int[] array, int left, int right) {
        int pivotIndex = (left + right) / 2;
        int pivotElement = array[pivotIndex]; // taking first element as pivotElement
        while (left <= right) { //searching number which is greater than pivotElement, setting left index
            while (array[left] < pivotElement) {
                left++;
            } //searching number which is less than pivotElement, setting right index
            while (array[right] > pivotElement) {
                right--;
            } // swap the values
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp; //increment left index and decrement right index
                left++;
                right--;
            }
        }
        return left;
    }
}
