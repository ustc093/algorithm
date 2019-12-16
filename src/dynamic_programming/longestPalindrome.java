package dynamic_programming;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月23日 13:44
 */
public class longestPalindrome {

    private static String solution(String s) {
        int length = s.length();
        boolean[][] P = new boolean[length][length];
        String maxPal = "";

        for (int len = 1; len <= length; len++) //遍历所有的长度
            for (int start = 0; start < length; start++) {
                int end = start + len - 1;
                if (end>=length){
                    break;
                }
                P[start][end] = (len == 1 || len == 2 || P[start + 1][end - 1]) && s.charAt(start) == s.charAt(end); //长度为 1 和 2 的单独判断下
                if (P[start][end]) {
                    maxPal = s.substring(start, end + 1);
                }
            }
        return maxPal;
    }

    public static void main(String[] args) {
        System.out.println(solution("cbbd"));
    }
}
