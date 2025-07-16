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
    public ListNode partition(ListNode head, int x) {
        ListNode comp = head;

        ListNode small = new ListNode();
        ListNode sh = small;

        ListNode big = new ListNode();
        ListNode bh = big;

        small.next = head;
        big.next = head;

        while (comp != null) {
            if (comp.val >= x) {
                big.next = comp;
                big = big.next;
                
            } else {
                small.next = comp;
                small = small.next;
            }
            comp = comp.next;
        }
        big.next = null;
        small.next = bh.next;

        return sh.next;
    }
}