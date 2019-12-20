package sort;


/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月17日 17:06
 */
public class InsertSort {

    public static void sort(int[] array) {
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

}
