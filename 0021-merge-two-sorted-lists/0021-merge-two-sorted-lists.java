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
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode output = new ListNode(0);
        ListNode result = output;
        while (l1 != null && l2 != null) {
            // l1, l2 compare values, set up smaller and move to the next node
            if (l1.val > l2.val) {
                output.next = l2;
                l2 = l2.next;
            } else {
                output.next = l1;
                l1 = l1.next;
            }
            output = output.next;
        }

        if (l1 == null) output.next = l2;
        if (l2 == null) output.next = l1;
        return result.next;
    }
}