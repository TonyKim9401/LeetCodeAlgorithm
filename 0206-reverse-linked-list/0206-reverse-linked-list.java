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
    public ListNode reverseList(ListNode head) {
    		if (head == null) {
            return null;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;
        
        while (currNode.next != null) {
        		nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        currNode.next = prevNode;
        return currNode;
    } 
}