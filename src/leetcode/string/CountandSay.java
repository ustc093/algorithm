package leetcode.string;

/**
 * 38. 外观数列
 * <p>
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 * 注意：整数序列中的每一项将表示为一个字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 * <p>
 * 链接：https://leetcode-cn.com/problems/count-and-say
 *
 * @author gaozhen
 * 2020年01月03日 10:53
 */
public class CountandSay {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            char preChar = str.charAt(0);
            StringBuilder tempResult = new StringBuilder(preChar);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == preChar) {
                    count++;
                } else {
                    tempResult.append(count).append(preChar);
                    count = 1;
                    preChar = str.charAt(j);
                }
            }
            tempResult.append(count).append(preChar);
            str = tempResult;
        }
        return str.toString();
    }
}
