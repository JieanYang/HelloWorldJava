package leetcode.C_03_linked_list.D2023_11_18_do_3_Q92_reverse_linked_list_II;

import leetcode.C_03_linked_list.ListNode;

public class MySolution {

    public static void main(String[] args) {
        System.out.println("test");

        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        reverseBetween(head1, 2, 4);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prefixNode = null, leftNode = null, rightNode = null, restNode = null, reversedMiddleNode = null;
        ListNode cur = head, prefix = head;
        int i = 1;

        if (left == right) {
            return head;
        }

        while (cur != null) {
            if (i == left) {
                leftNode = cur;
                if (prefix != cur) {
                    prefixNode = prefix;
                }
            }
            if (i == right) {
                rightNode = cur;
                if (cur.next != null) {
                    restNode = cur.next;
                }
            }
            prefix = cur;
            cur = cur.next;
            i++;
        }

        // if (prefixNode != null) {
        // System.out.println("prefixNode.val");
        // System.out.println(prefixNode.val);
        // }
        // if (leftNode != null) {
        // System.out.println("leftNode.val");
        // System.out.println(leftNode.val);
        // }
        // if (rightNode != null) {
        // System.out.println("rightNode.val");
        // System.out.println(rightNode.val);
        // }
        // if (restNode != null) {
        // System.out.println("restNode.val");
        // System.out.println(restNode.val);
        // }

        if (prefixNode != null) {
            prefixNode.next = null;
        }
        if (rightNode != null) {
            rightNode.next = null;
        }

        reversedMiddleNode = reverseNode(leftNode);

        if (prefixNode != null) {
            prefixNode.next = reversedMiddleNode;
        }
        if (restNode != null) {
            leftNode.next = restNode;
        }

        return prefixNode != null ? head : reversedMiddleNode;
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
