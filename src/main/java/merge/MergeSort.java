package merge;

import coctail.CoctailSort;

import java.util.Arrays;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 *  O(n log n) Требуется O(n) дополнительной памяти
 *  Сортируемый массив разбивается на две части примерно одинакового размера;
 *  Каждая из получившихся частей сортируется отдельно, например — тем же самым алгоритмом;
 *  Два упорядоченных массива половинного размера соединяются в один.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] ints = {2,1,42,1,52,2};
        System.out.println(Arrays.toString(merge(ints, 0, ints.length-1)));
    }

    private static int[] merge(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;
            //TODO refactor not to allocate extra arrays System.arrayCopy
            int[] mergeOne = merge(array, left, mid);
            int[] mergeTwo = merge(array, mid + 1, right);
            return mergeSorted(mergeOne, mergeTwo);
        } else {
            return Arrays.copyOfRange(array, left, right+1);
        }
    }

    //sample merge. TODO refactor it one day ^_^
    private static int[] mergeSorted(int[] mergeOne, int[] mergeTwo) {
        if (mergeOne == null || mergeOne.length == 0) {
            return mergeTwo;
        } else if (mergeTwo == null || mergeTwo.length==0) {
            return mergeOne;
        }
        int fullLength = mergeOne.length + mergeTwo.length;
        int[] result = new int[fullLength];
        int indexFirst = 0;
        int indexSecond = 0;
        for (int i = 0; i < result.length; i++) {
            if (mergeOne.length == indexFirst) {
                result[i] = mergeTwo[indexSecond++];
            }else if (mergeTwo.length == indexSecond) {
                result[i] = mergeOne[indexFirst++];
            }
            else if (mergeOne[indexFirst] < mergeTwo[indexSecond]) {
                result[i] = mergeOne[indexFirst++];
            } else {
                result[i] = mergeTwo[indexSecond++];
            }
        }
        return result;
    }
}
