package utils.array;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年12月17日 11:13
 */
public class ArrayUtils {
    /**
     * 显示数组
     *
     * @param array
     */
    public static void display(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void display(int[][] array){
        for(int[] is:array){
            for(int element:is){
                System.out.print(element+",");
            }
            System.out.println("");
        }
    }

    /**
     * 根据下标来交换数组中的元素
     *
     * @param 数组  array
     * @param 下标i
     * @param 下标j
     */
    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    /**
     * 生成整数随机数组
     */
    public static int[] generateArray(int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }
}
