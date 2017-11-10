package gnome;

import java.util.Arrays;

import static utils.UtilSwap.swap;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * O(n^2)
 * Алгоритм находит первое место, где два соседних элемента стоят в неправильном порядке и меняет их местами.
 * Он пользуется тем фактом, что обмен может породить новую пару, стоящую в неправильном порядке, только до или после
 * переставленных элементов. Он не допускает, что элементы после текущей позиции отсортированы, таким образом, нужно
 * только проверить позицию до переставленных элементов.
 */
public class GnomeSort {
    public static void main(String[] args) {
        int[] ints = {123, 4, 2, 5, 62};
        gnome(ints);
        System.out.println(Arrays.toString(ints));
    }
    private static void gnome(int[] array) {
        int currentIndex = 1;
        while (currentIndex < array.length) {
            if (currentIndex == 0 || array[currentIndex - 1] <= array[currentIndex])
                //no swap need
                currentIndex++;
            else {
                swap(array, currentIndex, currentIndex -1);
                currentIndex--;
                //to be sure if previous is not lover.
            }
        }

    }
}
