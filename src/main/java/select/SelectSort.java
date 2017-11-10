package select;

import java.util.Arrays;

import static utils.UtilSwap.swap;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * O(n^2)
 * находим номер минимального значения в текущем списке
 * производим обмен этого значения со значением первой неотсортированной позиции
 * (обмен не нужен, если минимальный элемент уже находится на данной позиции)
 * теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] ints = {12, 51, 2, 52, 511, 6};
        select(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void select(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }
}
