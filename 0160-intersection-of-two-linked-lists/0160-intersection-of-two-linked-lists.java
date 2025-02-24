/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    ListNode findcollision(ListNode small,ListNode larger,int diff){
     for(int i=0;i<diff;i++){
                larger=larger.next;
            }
            while(larger!=null){
                if(small==larger)
                return small;
                larger=larger.next;
                small=small.next;
            }
            return null;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int n1=0;
        int n2=0;
        while(temp1!=null){
            n1++;
            temp1=temp1.next;
        }
         while(temp2!=null){
            n2++;
            temp2=temp2.next;
        }
        temp1=headA;
         temp2=headB;
        if(n1>=n2){
            int diff=n1-n2;
           return findcollision(headB,headA,diff);

        }
        else{
            int diff=n2-n1;
            return findcollision(headA,headB,diff);
        }

    }
}