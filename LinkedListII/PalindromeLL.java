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
    public boolean isPalindrome(ListNode head) {
        /*ListNode dummy=new ListNode(0);
        ListNode curr1=head;
        ListNode curr2=dummy;
        while(curr1!=null)
        {
            curr2.next=new ListNode(curr1.val);
            curr2=curr2.next;
            curr1=curr1.next;
        }
        curr1=head;
        ListNode prev=null;
        while(curr1!=null)
        {
            ListNode temp=curr1.next;
            curr1.next=prev;
            prev=curr1;
            curr1=temp;
        }
        ListNode i=dummy.next;
        ListNode j=prev;
        while(i!=null)
        {
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;*/
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode i=head;
        ListNode j=prev;
        while(i!=null && j!=null)
        {
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}