package leetcode.linkedlist;

import utils.linkedlist.LinkedListUtils;

/**
 * 23. 合并K个排序链表
 * <p>
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * 地址：https://leetcode-cn.com/problems/merge-k-sorted-lists/
 *
 * @author gaozhen
 * 2019年12月31日 16:18
 */
public class MergeSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int n = lists.length;
        if (n == 1) {
            return lists[0];
        }
        while (n > 1) {
            for (int i = 0; i < n / 2; i++) {
                lists[i] = MergeTwoSortedLists.mergeTwoLists(lists[i],lists[n-i-1]);
            }
            n = (n+1)/2;
        }
        return lists[0];
    }

    public static void main(String[] args) {
        ListNode result = mergeKLists(new ListNode[]{
                LinkedListUtils.array2List(new int[]{1,4,5}),
                LinkedListUtils.array2List(new int[]{1,3,4}),
                LinkedListUtils.array2List(new int[]{2,6})
        });
        LinkedListUtils.displayLinkedList(result);
    }
}
