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
    public int getDecimalValue(ListNode head) {
        String bin = "";

        while (head != null) {
            bin += head.val;
            head = head.next;
        }
        
        int convert = 1;
        int output = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            int cand = bin.charAt(i) - '0';
            cand *= convert;
            convert *= 2;
            output += cand;
        }

        return output;
    }
}