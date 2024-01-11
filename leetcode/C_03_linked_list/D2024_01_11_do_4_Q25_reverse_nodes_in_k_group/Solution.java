package leetcode.C_03_linked_list.D2024_01_11_do_4_Q25_reverse_nodes_in_k_group;

import leetcode.C_03_linked_list.ListNode;

public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }

        int i = 0;
        ListNode pre, result = null, lastResult = null;

        ListNode cur = head, left = head;

        while (cur != null) {
            pre = cur;
            cur = cur.next;
            i++;

            if (i % k == 0) {
                pre.next = null;
                reverseNode(left);
                left.next = cur;

                if (result == null) {
                    result = pre;
                }

                if (lastResult == null) {
                    lastResult = left;
                } else {
                    lastResult.next = pre;
                    lastResult = left;
                }

                pre = left;
                left = cur;
            }
        }

        return result;
    }

    public static ListNode reverseNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode reversedNode = reverseNode(node.next);
        node.next.next = node;
        node.next = null;
        return reversedNode;
    }

}
