package shell;

import utils.UtilSwap;

import java.util.Arrays;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * начала сравниваются и сортируются между собой значения, стоящие один от другого на некотором расстоянии
 * d. После этого процедура повторяется для некоторых меньших значений d, а завершается сортировка Шелла упорядочиванием
 * элементов при d=1
 * O(n^2)
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] ints = {2, 1, 5, 2, 11};
        shell(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void shell(int[] array) {
        int gap = array.length / 2;
        while (gap > 0)
        {
            for (int i = gap; i < array.length; i++)
            {
                int j = i;
                int temp = array[i];
                while (j >= gap && array[j - gap] > temp)
                {
                    array[j] = array[j - gap];
                    j = j - gap;
                }
                array[j] = temp;
            }
            if (gap == 2)
                gap = 1;
            else
                gap *= (5.0 / 11);

        }
    }
}
