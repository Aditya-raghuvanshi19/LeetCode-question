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
        //inplace
        // if(list1==null)
        // return list2;
        // if(list2==null)
        // return list1;

        // if(list2.val>list2.val)
        // {
        //     ListNode temp=list1;
        //     list1=list2;
        //     list2=temp;
        // }
        // ListNode res=list1;
        // while(list1 != null && list2 !=null){
        //     ListNode temp=null;
        //     while(list1 != null && list1.val <=list2.val){
        //         temp=list1;
        //         list1=list1.next;
        //     }
        //     temp.next=list2;
        //     //swap because i have write only for list1 is less if list2 less we swap and make list1 point to less one.
        //     ListNode temp2=list1;
        //     list1=list2;
        //     list2=temp;

        // }
        // return res;

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1 != null && list2 !=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
            
        }
        if(list1 != null){
            temp.next=list1;
           

        }
      if(list2 != null){
            temp.next=list2;
            

        }
        return dummy.next;

        


    }
}