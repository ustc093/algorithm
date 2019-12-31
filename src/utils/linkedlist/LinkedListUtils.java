package utils.linkedlist;

import leetcode.linkedlist.ListNode;

/**
 * @author gaozhen
 * 2019年12月31日 16:41
 */
public class LinkedListUtils {

    public static ListNode array2List(int[] array) {
        ListNode curr = new ListNode(0);
        ListNode head = curr;
        for (int i : array) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return head.next;
    }

    public static void displayLinkedList(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            if (sb == null || sb.length() == 0) {
                sb.append(listNode.val);
                listNode = listNode.next;
                continue;
            }
            sb.append("->");
            sb.append(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(sb);
    }

}
