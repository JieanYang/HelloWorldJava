package leetcode.C_03_linked_list.D2023_11_18_Q141_linked_list_cycle;

import leetcode.C_03_linked_list.ListNode;

public class index {
    public static void main(String[] args) {
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
