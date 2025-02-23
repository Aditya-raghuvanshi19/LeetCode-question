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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode temp=head;
        ListNode temp2=head.next;
        ListNode temp3=temp2;
        while(temp3!=null && temp3.next!=null){
            temp.next=temp.next.next;
            temp3.next=temp3.next.next;
            temp=temp.next;
            temp3=temp3.next;
        }
        temp.next=temp2;
        return head;
    }
}