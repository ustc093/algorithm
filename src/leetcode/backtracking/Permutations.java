package leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 46. 全排列
 *
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 *
 * @author gaozhen
 * 2020年01月03日 16:54
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> list = new LinkedList<>();
        ArrayList<Integer> numList = new ArrayList<>();
        for(int temp:nums){
            numList.add(temp);
        }
        helper(nums.length, 0, list, numList);
        return list;
    }

    private static void helper(int n,int index,List<List<Integer>> result,ArrayList<Integer> numList){
        if(n==index+1){
            result.add(new ArrayList<Integer>(numList));
            return;
        }
        for(int i = index;i<n;i++){
            Collections.swap(numList, i, index);
            helper(n, index+1, result, numList);
            Collections.swap(numList, i, index);
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }
}
