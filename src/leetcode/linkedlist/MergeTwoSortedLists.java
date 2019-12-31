package leetcode.linkedlist;

/**
 * 21. 合并两个有序链表
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author gaozhen
 * 2019年12月31日 14:21
 */

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode head = curr;
        if(l1 == null && l2 == null ){
            return head.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        //l2还有节点
        if(l1 == null && l2!= null){
            curr.next = l2;
        }
        if(l1 !=null && l2 == null){
            curr.next = l1;
        }
        return head.next;
    }
}

