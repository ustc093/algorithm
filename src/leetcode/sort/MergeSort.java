package leetcode.sort;


/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月18日 16:55
 */
public class MergeSort {

    public static void sort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(array, start, mid);
            sort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[array.length];
        int p1 = left, k = left, p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            temp[k++] = array[p1] <= array[p2] ? array[p1++] : array[p2++];
        }
        while (p1 <= mid) {
            temp[k++] = array[p1++];
        }
        while (p2 <= right) {
            temp[k++] = array[p2++];
        }
        //复制数组
        for (int i = left; i <= right; i++) {
            array[i] = temp[i];
        }
    }

}
