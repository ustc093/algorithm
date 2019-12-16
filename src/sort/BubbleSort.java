package sort;

import utils.MyUtils;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月18日 16:37
 */
public class BubbleSort {

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    MyUtils.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        MyUtils.display(array);
        sort(array);
        MyUtils.display(array);
    }
}
