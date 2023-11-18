package leetcode.C_03_linked_list.D2023_11_18_Q237_delete_node_in_a_linked_list;

import leetcode.C_03_linked_list.ListNode;

/**
 * index
 */
public class index {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}