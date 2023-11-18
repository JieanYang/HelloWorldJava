package leetcode.C_03_linked_list.D2023_11_18_Q92_reverse_linked_list_II;

import leetcode.C_03_linked_list.ListNode;

public class index {
    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode m_node = head;
        ListNode n_node = head;

        for (int i = 1; i < left; i++) {
            pre = pre.next; // pre.next = m_node;
            m_node = m_node.next;
        }

        for (int i = 1; i < right; i++) {
            n_node = n_node.next;
        }

        while (m_node != n_node) {
            pre.next = m_node.next;
            m_node.next = n_node.next;
            n_node.next = m_node;
            m_node = pre.next;
        }

        return pre;
    }

}
