package sort;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年12月23日 15:46
 */
public class CountSort {
    public static int[] sort(int[] array,int max){
        int[] result = new int[array.length];
        //初始化计数数组
        int[] count = new int[max];
        //对计数数组赋值
        for (int i = 0;i<array.length;i++){
            count[array[i]]++;
        }
        //对count数组累计求和,数组中是小于等于i 有多少个
        for (int i = 1;i<count.length;i++){
            count[i] = count[i-1] +count[i];
        }

        for (int i = array.length-1;i>=0;i--){
            result[count[array[i]]-1] = array[i];
            count[array[i]]--;
        }
        return result;
    }
}
