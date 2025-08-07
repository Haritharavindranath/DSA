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
        /*List<Integer> a=new ArrayList<>();
        while(list1!=null)
        {
            a.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null)
        {
            a.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(a);
        if(a.size()==0) return null;
        ListNode ans=new ListNode(a.get(0));
        ListNode curr=ans;
        for(int i=1;i<a.size();i++)
        {
            curr.next=new ListNode(a.get(i));
            curr=curr.next;
        }
        return ans;*/

        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 != null) curr.next = list1;
        if (list2 != null) curr.next = list2;

        return ans.next;

    }
}