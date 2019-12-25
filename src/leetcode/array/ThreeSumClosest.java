package leetcode.array;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 *
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * @author gaozhen
 * 2019年12月25日 14:08
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int min = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-min)){
                    min = sum;
                }
                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-3,-2,-5,3,-4},-1));
    }
}
