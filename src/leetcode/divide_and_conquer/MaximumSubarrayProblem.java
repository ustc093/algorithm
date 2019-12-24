package leetcode.divide_and_conquer;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月19日 14:22
 */
public class MaximumSubarrayProblem {
    private static int[] findMaximumSubarray(int[] array, int low, int height) {
        if (low == height) {
            int[] temp = {low, height, array[low]};
            return temp;
        } else {
            int mid = (low + height) / 2;
            int[] leftTemp = findMaximumSubarray(array, low, mid);
            int[] rightTemp = findMaximumSubarray(array, mid + 1, height);
            int[] midTemp = findMaximumCrossMid(array, low, mid, height);
            if (leftTemp[2] > rightTemp[2] && leftTemp[2] > midTemp[2]) {
                return leftTemp;
            } else if (rightTemp[2] > leftTemp[2] && rightTemp[2] > midTemp[2]) {
                return rightTemp;
            } else {
                return midTemp;
            }
        }
    }


    private static int[] findMaximumCrossMid(int[] array, int low, int mid, int height) {


        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int minIndex = low;
        for (int i = mid; i >= low; i--) {
            sum += array[i];
            if (sum > leftSum) {
                leftSum = sum;
                minIndex = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        int maxIndex = height;
        sum = 0;
        for (int i = mid + 1; i <= height; i++) {
            sum += array[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxIndex = i;
            }
        }
        int[] result = {minIndex, maxIndex, leftSum + rightSum};
        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, -10, -3, 2, 7, -15};
        int[] result = findMaximumSubarray(array, 0, array.length - 1);
        System.out.printf("左坐标%d,右坐标%d,最大子数组和为%d", result[0], result[1], result[2]);
    }
}
