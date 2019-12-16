package sort;

import utils.MyUtils;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月17日 17:06
 */
public class Insertsort {

    private static void sort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            j = i - 1;
            //一定要把j>=0放到前面，array[j]中，j有可能是-1 引起错误
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        MyUtils.display(array);
        sort(array);
        MyUtils.display(array);
    }
}
