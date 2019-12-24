package sort;

import utils.array.ArrayUtils;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年12月19日 16:13
 */
public class QuickSort {
    public static void sort(int[] array, int p, int r) {
        if (p < r) {
            int q = randomPartition(array, p, r);
            sort(array, p, q - 1);
            sort(array, q + 1, r);
        }

    }

    private static int partition(int[] array, int p, int r) {
        int key = array[p];
        int i = p;

        for (int j = p + 1; j <= r; j++) {
            if (key >= array[j]) {
                ArrayUtils.swap(array, ++i, j);
            }
        }
        ArrayUtils.swap(array, p, i);
        return i;
    }

    private static int randomPartition(int[] array, int p ,int r){
        int i = p+(int)Math.random()*(r-p);
        ArrayUtils.swap(array, p, i);
        return partition(array,p,r);
    }


}
