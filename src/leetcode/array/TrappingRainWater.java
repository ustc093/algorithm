package leetcode.array;

/**
 * 42. 接雨水
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）
 *
 * 示例:
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/trapping-rain-water
 *
 * @author gaozhen
 * 2020年01月03日 15:45
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length;
        //找出左面最长的柱子 从左到右
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //找出右面最长的柱子 从右到左
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n-2 ; j>=0;j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }
        int result = 0;
        for(int i = 0;i<n;i++){
            result += Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return result;
    }
}
