package leetcode.array;

import java.util.*;

/**
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 注意：答案中不可以包含重复的三元组
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * @author gaozhen
 * 2019年12月24日 15:53
 */
public class ThreeNum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //base指针
        int i = 0;
        int n = nums.length;
        while(i<n-2){
            int base = i;
            int left = i+1;
            int right = n-1;
            if(nums[base]>0){
                i = moveRight(nums,i+1);
                continue;
            }
            while(left<right){
                int sum = nums[base]+nums[left]+nums[right];
                //找到元素
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[base]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left = moveRight(nums,left+1);
                    right = moveLeft(nums,right-1);
                }else if(sum < 0){
                    left = moveRight(nums,left+1);
                }else{
                    right = moveLeft(nums,right-1);
                }
            }
            i = moveRight(nums,i+1);
        }
        return result;
    }


    //去重
    private int moveLeft(int[] nums,int right){
        while(right == nums.length-1 || (right>=0 && nums[right] == nums[right+1])){
            right--;
        }
        return right;
    }

    private int moveRight(int[] nums,int left){
        while(left == 0 || (left<nums.length && nums[left] == nums[left-1])){
            left++;
        }
        return left;
    }

}
