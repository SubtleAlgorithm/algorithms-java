package com.subtlealgorithm.linked_list.reverse_linked_list;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nodeBefore = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode temp = currentNode.next;
            currentNode.next = nodeBefore;
            nodeBefore = currentNode;
            currentNode = temp;
        }

        return nodeBefore;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
