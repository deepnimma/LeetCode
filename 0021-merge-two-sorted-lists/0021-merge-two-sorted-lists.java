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
        ListNode one = list1, two = list2;
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;

        while (one != null && two != null) {
            if (one.val <= two.val) {
                curr.next = new ListNode(one.val);
                one = one.next;
            } else {
                curr.next = new ListNode(two.val);
                two = two.next;
            } // if-else

            curr = curr.next;
        } // while

        if (one != null) curr.next = one;
        else if (two != null) curr.next = two;

        return dummyHead.next;
    } // mergeTwoLists
} // Solution