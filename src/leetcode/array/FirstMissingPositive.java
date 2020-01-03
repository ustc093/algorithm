package leetcode.array;

/**
 * 41. 缺失的第一个正数
 *
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 *
 * 示例 1:
 * 输入: [1,2,0]
 * 输出: 3
 *
 * 示例 2:
 * 输入: [3,4,-1,1]
 * 输出: 2
 *
 * 示例 3:
 * 输入: [7,8,9,11,12]
 * 输出: 1
 *
 * 说明:
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-missing-positive
 *
 *
 * 解：
 *     1.遍历数组，看看存不存在1，如果不存在，直接返回1
 *     2.如果存在1且数组长度为1，直接返回2
 *     3.把数组中的负数、0、大于数组长度的数变成1，因为这些数永远不可能返回
 *     4.使用变形的位图法，例如 如果数字2存在数组中，就把nums[2]的值变成负数，nums[0]存储的是等于数组长度的数字的负数
 *       [3,1,1,1,2,4,6,8] --> [3,1,1,-1,2,4,6,8] --> [3,-1,1,-1,2,4,6,8] --> [3,-1,1,-1,2,4,6,8] --> [3,-1,1,-1,2,4,6,8]
 *       --> [3,-1,-1,-1,2,4,6,8] --> [3,-1,-1,-1,-2,4,6,8] --> [3,-1,-1,-1,-2,4,-6,8] --> [-3,-1,-1,-1,-2,4,-6,8]
 *     5.处理完，从1循环数组，如果遇到正数就返回下标，例子中第一个正数是4，返回下标5.如果遍历完没有正数，nums[0]若正数就返回 n，最后返回n+1
 *
 * @author gaozhen
 * 2020年01月03日 14:31
 */
public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        if(nums == null){
            return -1;
        }
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1){
                count++;
            }
        }
        //step.1
        if(count == 0){
            return 1;
        }
        //step.2
        if(n == 1){
            return 2;
        }
        //step.3
        for (int i =0;i<n;i++){
            if(nums[i]<=0 || nums[i] >n){
                nums[i] = 1;
            }
        }
        //step.4
        for (int i =0;i<n;i++){
            int k = Math.abs(nums[i]);
            if(k==n){
                nums[0] = -Math.abs(nums[0]);
            }else {
                nums[k] = -Math.abs(nums[k]);
            }
        }
        //step.5
        for (int i = 1;i<n;i++){
            if (nums[i] > 0){
                return i;
            }
        }
        //原数组形如[1,2,0] --> [1,2,1] --> [1,-2,-1]
        if(nums[0]>0){
            return n;
        }
        //原数组 形如[1,2,3,4,5] --> [-1,-2,-3,-4,-5]
        return n+1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,3,4,5}) +"---"+firstMissingPositive(new int[]{1,2,0})+"---"+firstMissingPositive(new int[]{-1,5,4,12,6,1,3}));
    }
}
