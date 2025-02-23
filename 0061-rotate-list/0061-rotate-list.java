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
    public ListNode rotateRight(ListNode head, int k) {
        int count=0;
        ListNode temp2=head;
        while(temp2!=null){
            count++;
            temp2=temp2.next;
        }
        if(head==null)
           return null;

        k=k%count;//this is to reduce the number of iteration
        for(int i=0;i<k;i++){
            ListNode temp=head;
           ListNode temp1=head;
           
            while(temp.next!=null){
            temp1=temp;
            temp=temp.next;
            }
            temp.next=head;
            temp1.next=null;
            head=temp;
        }
        return head;
    }
}