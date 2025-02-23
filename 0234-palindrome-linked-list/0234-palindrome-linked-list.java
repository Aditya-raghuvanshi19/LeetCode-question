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
    public ListNode reverse(ListNode h){
        ListNode prev=null;
        ListNode cu=h;
        while(cu!=null){
            ListNode next=cu.next;
            cu.next=prev;
            prev=cu;
            cu=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow.next);
        ListNode temp1=newhead;
        ListNode temp=head;
        while(temp1!=null){
            if(temp.val!=temp1.val){
                //reverse(newhead);
                return false;
            }
            temp1=temp1.next;
            temp=temp.next;
            
        }
        //reverse(newhead);
        return true;
    }
}