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
    public ListNode findmiddle(ListNode h){
        ListNode slow=h;
        ListNode fast=h;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode h1,ListNode h2){
        if(h1==null)
        return h2;
        if(h2==null)
        return h1;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
            }else{
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;
            }
        }
        if(h1!=null){
            temp.next=h1;
           
        }
        if(h2!=null){
            temp.next=h2;
           
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode middle=findmiddle(head);
        ListNode lefthead=head;
        ListNode righthead=middle.next;
        middle.next=null;
        ListNode left=sortList(lefthead);
        ListNode right=sortList(righthead);
        
        return merge(left,right);

    }
}