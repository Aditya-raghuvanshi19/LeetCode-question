class Solution {
    public int findDuplicate(int[] nums) {
        //here in this we uses the concept of linked list slow anf fast pointer
        int slow=nums[0];//initialise the slow and fast at 0 same as in ll head
        int fast=nums[0];
        do{
            slow=nums[slow];//go by one
            fast=nums[nums[fast]];//go by two
        }while(slow!=fast);//till they collide

        fast=nums[0];//if collide set fast at 0thto find at what number they again intersact that is the number repeat in the array
        while(slow!=fast){//till they again collide
            slow=nums[slow];//move simple by one step
            fast=nums[fast];//move simple by one step
        }
        return slow;//return any one slow or fast
    }
}