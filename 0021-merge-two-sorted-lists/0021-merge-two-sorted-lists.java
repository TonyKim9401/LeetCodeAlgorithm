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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode real = temp;
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                real.next = p1;
                real = p1;
                p1 = p1.next; 
            } else {
                real.next = p2;
                real = p2;
                p2 = p2.next;
            }
        }

        if (p1 != null) {
            real.next = p1;
        }
        if (p2 != null) {
            real.next = p2;
        }
        return temp.next;
    }
}