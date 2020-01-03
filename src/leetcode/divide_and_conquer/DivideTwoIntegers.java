package leetcode.divide_and_conquer;

/**
 * 29. 两数相除
 *
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 *
 * 示例 2:
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 *
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 *
 * @author gaozhen
 * 2020年01月02日 16:39
 */
public class DivideTwoIntegers {public int divide(int dividend, int divisor) {
    boolean sign = (dividend >0) ^ (divisor>0);
    if(dividend>0){
        dividend = -dividend;
    }
    if(divisor >0){
        divisor = -divisor;
    }
    int count = 0;
    while(dividend<=divisor){
        int tempCount = -1;
        int tempDivisor = divisor;
        while(dividend <= (tempDivisor<<1)){
            if(tempDivisor <= (Integer.MIN_VALUE >> 1)) {
                break;
            }
            tempCount = tempCount<<1;
            tempDivisor = tempDivisor<<1;
        }
        dividend -= tempDivisor;
        count += tempCount;
    }
    if(!sign){
        if(count<=Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return -count;
    }
    return count;
}

}
