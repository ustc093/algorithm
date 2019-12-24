package leetcode.dynamic_programming;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月20日 15:53
 */
public class CutRod {

    private static int bottomUpCutRod(int[] array, int n) {
        int[] r = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            r[i] = Integer.MIN_VALUE;
        }
        r[0] = 0;
        for (int j = 1; j <= n; j++) {
            int q = Integer.MIN_VALUE;
            for (int i = 1; i <= j; i++) {
                q = Math.max(q, array[i] + r[j - i]);
            }
            r[j] = q;
        }
        return r[n];
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println(bottomUpCutRod(array, 5));
    }
}
