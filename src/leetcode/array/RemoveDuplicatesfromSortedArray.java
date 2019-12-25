package leetcode.array;

import utils.array.ArrayUtils;

/**
 * @author gaozhen@cloudwalk.cn
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
