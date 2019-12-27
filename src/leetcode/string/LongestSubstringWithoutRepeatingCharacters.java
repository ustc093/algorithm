package leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author gaozhen
 * 2019年12月27日 17:40
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public  int lengthOfLongestSubstring(String s){
        int n = s.length();
        int i = 0,j = 0, result = 0;
        Set<Character> set = new HashSet<>();
        while (i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                result = Math.max(result, j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return result;
    }
}
