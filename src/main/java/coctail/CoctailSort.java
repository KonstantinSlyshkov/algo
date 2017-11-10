package coctail;

import java.util.Arrays;

import static utils.UtilSwap.swap;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * Во-первых, если при движении по части массива перестановки не происходят, то эта часть массива уже отсортирована и,
 * следовательно, её можно исключить из рассмотрения.
 *
 * Во-вторых, при движении от конца массива к началу минимальный элемент «всплывает» на первую позицию, а максимальный
 * элемент сдвигается только на одну позицию вправо.
 *
 * Лучший случай для этой сортировки — отсортированный массив ( O(n)),
 * худший — отсортированный в обратном порядке ( {\displaystyle O(n^{2})} O(n^{2})).
 */
public class CoctailSort {
    public static void main(String[] args) {
        int[] ints = {124, 15, 1, 5, 2, 5};
        System.out.println(Arrays.toString(cocktail(ints)));
    }

    public static int[] cocktail(int[] array) {
        int left = 0;
        int right = array.length -1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i-1]) {
                    swap(array, i, i-1);
                }
            }
            left++;
        }
        return array;
    }
}
