class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int el=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                el=nums[i];
                count=1;
            }
            else if(nums[i]==el)
            count++;
            else
            count--;
        }
        if(count>0)
        return el;

        else
        return -1;

    }
}