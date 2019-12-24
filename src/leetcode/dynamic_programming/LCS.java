package leetcode.dynamic_programming;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月20日 17:48
 * 最长公共子序列
 * <p>
 * c[i,j]={
 * 0                         ,若 i = 0 || j = 0
 * c[i-1,j-1] + 1            ,若 str1i = str2i
 * max(c[i-1,j],c[i,j-1])    ,若 str1i != str2i
 * }
 */
public class LCS {


    private static String printLCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        //反推结果
        StringBuffer sb = new StringBuffer();
        while (n > 0 && m > 0){
            if(str1.charAt(n-1) == str2.charAt(m-1)){
                sb.append(str1.charAt(n-1));
                n--;
                m--;
            }else {
                if(dp[n-1][m]>dp[n][m-1]){
                    n--;
                }else if(dp[n-1][m]<dp[n][m-1]){
                    m--;
                }else{
                    n--;
                }
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String str1 = "6512489";
        String str2 = "54871918";
        System.out.println(printLCS(str1, str2));
    }
}
