package leetcode.string;

/**
 * 14. 最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * @author gaozhen
 * 2019年12月30日 15:24
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String result = strs[0];
        for(int i = 1;i<strs.length;i++){
            //没找到包含的字符串
            while (strs[i].indexOf(result)!=0){
                //删除最后一个字符，直到strs[i]包含该前缀
                result = result.substring(0, result.length()-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
