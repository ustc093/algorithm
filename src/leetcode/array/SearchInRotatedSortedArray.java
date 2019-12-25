package leetcode.array;

/**
 * 33. 搜索旋转排序数组
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 *
 * @author gaozhen
 * 2019年12月25日 18:53
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        return help(nums,0,nums.length-1,target);
    }

    private int help(int[] nums,int start,int end,int target){
        if(end - start == 0){
            if(end >=0 && start<nums.length && target == nums[start]){
                return start;
            }else{
                return -1;
            }
        }
        int mid = (start + end)/2;
        if(nums[mid] == target) return mid;
        if(nums[start] <= nums[mid]){
            //左面有序
            if(target >= nums[start] && target<=nums[mid]){
                //target在左面
                return help(nums,start,mid-1,target);
            }else{
                return help(nums,mid+1,end,target);
            }
        }else{
            //右面有序
            if(target>=nums[mid] && target <= nums[end]){
                //target在右面
                return help(nums,mid+1,end,target);
            }else{
                return help(nums,start,mid-1,target);
            }
        }
    }
}
