package leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
 *
 * @author gaozhen
 * 2019年12月30日 17:43
 */
public class LetterCombinationsOfPhoneNumber {

    static Map<String, String> map = new HashMap<String,String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    private static List<String> result = new ArrayList<>();

    private static void helper(String str,String nextDigits){
        //到底，加入list，回溯
        if(nextDigits.length() == 0){
            result.add(str);
        }else {
            //temp内容是"abc"..."wxyz"
            String temp = map.get(nextDigits.substring(0, 1));
            for(int i = 0;i < temp.length();i++){
                helper(str+temp.charAt(i), nextDigits.substring(1));
            }
        }
    }

    public static List<String> letterCombinations(String digits){
        if(digits == null || digits.length() == 0){
            return result;
        }
        helper("",digits);
        return  result;
    }

    public static void main(String[] args) {
        String str = "23";
        letterCombinations(str);
        System.out.println(result);
    }
}
