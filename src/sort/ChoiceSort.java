package sort;

import utils.array.ArrayUtils;


/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月18日 16:25
 */
public class ChoiceSort {

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            ArrayUtils.swap(array, i, min_index);
        }
    }





}
