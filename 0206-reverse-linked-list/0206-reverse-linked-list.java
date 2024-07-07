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
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        ListNode output = new ListNode(0);
        ListNode dummy = output;
        for (int num : list) {
            output.next = new ListNode(num);
            output = output.next;
        }
        return dummy.next;
    }
}