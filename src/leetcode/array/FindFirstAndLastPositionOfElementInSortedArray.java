package leetcode.array;

import utils.array.ArrayUtils;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 *
 * @author gaozhen
 * 2019年12月26日 17:27
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int left = left_bound(nums,target);
        int right = right_bound(nums,target);
        return new int[]{left,right};
    }

    private static int left_bound(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (right+left)>>1;
            if(nums[mid]==target){
                right = mid - 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid+1;
            }
        }
        if(left<nums.length && nums[left] == target){
            return left;
        }else{
            return -1;
        }
    }
    private static int right_bound(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (right+left)>>1;
            if(nums[mid]==target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid+1;
            }
        }
        if(right>=0 && nums[right] == target){
            return right;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayUtils.display(searchRange(new int[]{5,7,8,8,8,10},8));
    }
}
