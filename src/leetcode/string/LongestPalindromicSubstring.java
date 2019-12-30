package leetcode.string;

/**
 * 5. 最长回文子串
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 解：中心扩散法
 *
 * @author gaozhen
 * 2019年12月30日 11:51
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return "";
        }
        int n = s.length();
        String result = "";
        for(int i = 0;i<n;i++){
            String str = "";
            String s1 = helper(s,i,i+1);
            String s2 = helper(s,i,i);
            if(s1.length()>s2.length()){
                str = s1;
            }else{
                str = s2;
            }
            if(str.length()>result.length()){
                result = str;
            }
        }
        return result;
    }

    private String helper(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}
