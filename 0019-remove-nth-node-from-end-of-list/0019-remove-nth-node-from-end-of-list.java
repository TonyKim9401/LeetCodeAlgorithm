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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // head.next = head.next.next;
        Map<Integer, ListNode> map = new HashMap<>();

        int i = 0;
        while (head != null) {
            map.put(i, head);
            head = head.next;
            i += 1;
        }
        int skip = map.size() - n;

        ListNode node = new ListNode(0);
        ListNode output = node;
        for (int idx : map.keySet()) {
            if (idx == skip) continue;
            node.next = map.get(idx);
            node = node.next;
            node.next = null;
        }
        return output.next;
    }
}