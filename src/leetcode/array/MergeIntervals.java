package leetcode.array;

import utils.array.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 *
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 示例 2:
 *
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 * 链接：https://leetcode-cn.com/problems/merge-intervals
 *
 * @author gaozhen
 * 2020年01月06日 17:50
 */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length<2){
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[] lastList = null;
        for(int[] interval:intervals){
            if(lastList == null || lastList[1]<interval[0]){
                lastList = interval;
                list.add(lastList);
            }else if(lastList[1]<interval[1]){
                lastList[1] = interval[1];
            }
        }
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        ArrayUtils.display(merge(new int[][]{{1,3},{2,6},{8,10}}));
        System.out.println(0x7fffffff);
    }
}
