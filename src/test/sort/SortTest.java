package test.sort;

import leetcode.sort.*;
import utils.array.ArrayUtils;

import java.util.*;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年12月17日 11:09
 */
public class SortTest {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(100, 60);
        //ArrayUtils.display(array);
        long start = System.currentTimeMillis();
        //InsertSort.sort(array);
        //BubbleSort.sort(array);
        //ChoiceSort.sort(array);
       //MergeSort.sort(array,0,array.length-1);
        //Arrays.sort(array);
        //array = CountSort.sort(array,10000000);
        QuickSort.sort(array,0,array.length-1);
        long end = System.currentTimeMillis();
        long runningTime = end - start;
        ArrayUtils.display(array);
        System.out.println("-------------------------------\t\n运行时间为:" + runningTime + "毫秒");


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);

        String s = "hello";
        System.out.println(s.substring(1, 5));

        System.out.println((-108)%10);

        System.out.println("hello".indexOf("llo"));


        Map<Character,Character> map = new HashMap<Character, Character>(){{
            put('(', ')');
            }};
        System.out.println(map.containsKey(')'));

        Stack<Character> stack = new Stack<>();

        System.out.println(stack.isEmpty()) ;
    }
}
