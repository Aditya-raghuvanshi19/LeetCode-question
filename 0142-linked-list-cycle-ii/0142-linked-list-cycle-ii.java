/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                slow=head;//also can be fast
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                    
                }
                
                return slow;//also can be fast,because now both reach at the same point and the point is the starting point
            }
            
        }
        return null;
    }
}