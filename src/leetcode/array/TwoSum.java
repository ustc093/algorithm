package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * No.1 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * @author gaozhen
 * 2019年12月24日 14:28
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int key = target - nums[i];
            if(map.containsKey(key) && map.get(key) != i){
                return new int[] {map.get(key),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
