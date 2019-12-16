package utils;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月20日 17:49
 */
public class MyUtils {
    public static void display(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
