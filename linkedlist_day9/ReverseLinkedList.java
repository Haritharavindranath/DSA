class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // store next
            current.next = prev;              // reverse pointer
            prev = current;                   // move prev forward
            current = nextNode;               // move current forward
        }

        return prev;
    }
}
