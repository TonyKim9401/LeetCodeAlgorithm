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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        Collections.sort(values);
        ListNode output = new ListNode(values.get(0));
        ListNode result = output;
        for (int i = 1; i < values.size(); i++) {
            output.next = new ListNode(values.get(i));
            output = output.next;
        }
        return result;
    }
}