package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * @author gaozhen
 * 2019年12月31日 14:27
 */
public class GenerateParentheses {

    static List<String> list = new ArrayList<>();

    public static List<String> generateParenthesis(int n){
        helper("", 0, 0, n);
        return list;
    }

    private static void helper(String str,int left,int right,int max){
        if(str.length() == 2*max){
            list.add(str);
            return;
        }
        if(left<max){
            helper(str+"(", left+1, right, max);
        }
        if(right<left){
            helper(str+")", left, right+1, max);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
