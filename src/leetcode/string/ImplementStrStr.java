package leetcode.string;

/**
 * 28. 实现 strStr()
 *
 * kmp的核心算法 是求next数组
 * <p>
 * 1.next[0]=-1。
 * 2.在求解next[j+1]时，令k=next[j]，
 * 3.比较T[j]与T[k]的值，
 * a. 如果p[j] = p[k], 则next[j+1] = next[k] + 1;。
 * b. 如果p[j] != p[k], 则令k=next[k]
 *
 * 重点: next[j] = k 代表p[j] 之前的模式串子串中，有长度为k 的相同前缀和后缀
 *
 * @author gaozhen
 * 2020年01月02日 11:38
 */
public class ImplementStrStr {

    private static int[] getNext(char[] pattern) {
        int[] next = new int[pattern.length];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < pattern.length - 1) {
            if (k == -1 || pattern[j] == pattern[k]) {
                //next[j + 1] = next[j] + 1 = k+1;
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    //如果匹配就返回 文本串首个匹配的位置，不匹配返回-1
    public static int mathString(String txt, String pattern) {
        char[] txtCharArray = txt.toCharArray();
        char[] patternCharArray = pattern.toCharArray();
        int[] next = getNext(patternCharArray);
        int i = 1;
        int j = 0;
        while (i < txt.length() && j < pattern.length()) {
            //j=-1 或者相等 i和j都要向前进一步，
            if (j == -1 || patternCharArray[j] == txtCharArray[i]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        //完成匹配
        if (j == pattern.length()) {
            return i - j;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(mathString("aaaaabaababa", "bab"));
    }
}
