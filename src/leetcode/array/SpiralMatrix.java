package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 *
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 *
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 链接：https://leetcode-cn.com/problems/spiral-matrix
 *
 * @author gaozhen
 * 2020年01月06日 14:24
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = (Math.min(m,n)+1)/2;
        int i = 0;
        List<Integer> list= new ArrayList<>();
        while(i<count){
            //从左向右遍历
            for(int j=i;j<n-i;j++){
                list.add(matrix[i][j]);
            }
            //从上向下
            for(int j = i+1;j<m-i;j++){
                list.add(matrix[j][n-i-1]);
            }
            //从右向左
            for(int j = (n-1)-(i+1);j>=i && i != m-1-i;j--){
                list.add(matrix[m-i-1][j]);
            }
            //从底向上
            for(int j=(m-1)-(i+1);j>i && i!=n-i-1;j--){
                list.add(matrix[j][i]);
            }
            i++;
        }
        return list;
    }
}
