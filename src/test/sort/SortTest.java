package test.sort;

import sort.*;
import utils.array.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年12月17日 11:09
 */
public class SortTest {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10000000, 60000000);
        ArrayUtils.display(array);
        long start = System.currentTimeMillis();
        //InsertSort.sort(array);
        //BubbleSort.sort(array);
        //ChoiceSort.sort(array);
       //MergeSort.sort(array,0,array.length-1);
        //Arrays.sort(array);
        //array = CountSort.sort(array,10000000);
        //QuickSort.sort(array,0,array.length-1);
        long end = System.currentTimeMillis();
        long runningTime = end - start;
        ArrayUtils.display(array);
        System.out.println("-------------------------------\t\n运行时间为:" + runningTime + "毫秒");
    }
}
