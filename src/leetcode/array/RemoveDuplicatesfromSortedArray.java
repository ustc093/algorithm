package leetcode.array;

import utils.array.ArrayUtils;

/**
 * 26. 删除排序数组中的重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * @author gaozhen
 * 2019年12月25日 15:41
 */
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int i = 0;
        int n = nums.length;
        while(i<n){
            int index = i;
            while(i<n-1 && nums[i] == nums[i+1]){
                i++;
            }
            if(i!=n-1){
                nums[++count] = nums[++i];
            }else{
                nums[count++] = nums[i++];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {0,0,0,0,1,1,1,2,2,3,3,4,4,4};
        System.out.println(removeDuplicates(array));
        ArrayUtils.display(array);
    }
}
