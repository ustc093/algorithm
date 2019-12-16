package sort;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月18日 16:25
 */
public class ChoiceSort {

    private static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            swap(array, i, min_index);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static void dispaly(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrray = {6, 5, 3, 1, 8, 7, 2, 4};
        dispaly(arrray);
        sort(arrray);
        dispaly(arrray);
    }
}
