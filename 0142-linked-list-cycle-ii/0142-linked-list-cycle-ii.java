/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        List<ListNode> list = new ArrayList<>();

        while (slow != null && slow.next != null) {
            list.add(slow);
            slow = slow.next;
            if (list.contains(slow)) return slow;
        }
        return null;
    }
}