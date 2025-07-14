/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 2) return head;

        int listLength = 0;
        ListNode dummy = head;
        while (dummy != null) {
            dummy = dummy.next;
            listLength += 1;
        }

        int move = listLength - (k % listLength);

        if (move < 2) return head;

        ListNode preNode = head;
        ListNode preNodeDummy = preNode;
        ListNode postNode = head;

        int postMove = move;
        while (postMove > 0) {
            postNode = postNode.next;
            postMove -= 1;
        }

        int preMove = move;

        while (preMove > 1) {
            preNode = preNode.next;
            preMove -= 1;
        }

        preNode.next = null;

        ListNode result = postNode;

        while (postNode.next != null) {
            postNode = postNode.next;
        }
        postNode.next = preNodeDummy;

        return result;
    }
}