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
    public void reorderList(ListNode head) {
        Stack<ListNode> half = new Stack<>();
        ListNode s = head, f = head;

        while (s != null && f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        } // while

        ListNode m = s;
        s = m.next;
        m.next = null;

        while (s != null) {
            half.push(s);
            s = s.next;
        } // while

        for (ListNode ln : half) ln.next = null;

        ListNode curr = head;

        while (!half.empty()) {
            System.out.println(curr.val);
            ListNode temp = curr.next;
            curr.next = half.pop();
            curr = curr.next;
            curr.next = temp;
            curr = curr.next;
        } // while
    } // reorderList
} // Solution