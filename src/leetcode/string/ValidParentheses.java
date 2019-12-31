package leetcode.string;

import java.util.*;

/**
 * 20. 有效的括号
 *
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * @author gaozhen
 * 2019年12月31日 11:41
 */
public class ValidParentheses {
    Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('(',')');
        put('{','}');
        put('[',']');
    }};

    public boolean isValid(String s) {
        if(s == null){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                //不匹配
                if(stack.isEmpty() || map.get(stack.peek()) != s.charAt(i)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
