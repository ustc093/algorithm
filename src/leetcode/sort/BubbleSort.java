package leetcode.sort;

import utils.array.ArrayUtils;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月18日 16:37
 */
public class BubbleSort {

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayUtils.swap(array, j, j + 1);
                }
            }
        }
    }

}
