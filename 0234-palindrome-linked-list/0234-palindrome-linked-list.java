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
        if(head==null || head.next==null)
        return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){//this condition so that it work for both odd and even length
            slow=slow.next;
            fast=fast.next.next;
        }//now slow is pointed to first mid if even if odd no two mid.
        ListNode newhead=reverse(slow.next);//reverse the second half ll ,and head of reverse is pointed by newhead
        ListNode temp1=newhead;
        ListNode temp=head;
        while(temp1!=null){//check till the second half reach null because first it goes to null than after iteration again temp go to null.
            if(temp.val!=temp1.val){//if in between loop value does not match return false
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