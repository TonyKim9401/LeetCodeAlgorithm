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
        Map<ListNode, ListNode> map = new HashMap<>();

        while (slow != null && slow.next != null) {
            map.put(slow, slow);
            slow = slow.next;
            if (map.containsKey(slow)) {
                return map.get(slow);
            }
        }
        return null;
    }
}