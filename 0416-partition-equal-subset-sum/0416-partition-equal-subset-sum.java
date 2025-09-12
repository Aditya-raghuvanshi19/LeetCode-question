class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totalsum = 0;
        for(int i:nums) totalsum += i;

        if(totalsum % 2 ==1)return false;

        int sum= totalsum /2 ;

        boolean[] prev = new boolean[sum+1];

        prev[0]= true;
        if(nums[0] <= sum) prev[nums[0]]=true; // it means we reach at index 0 and the value we need is already preset at the 0th index so we take and target become 0, we get subset

        for(int idx=1;idx<n;idx++){
            boolean[] curr=new boolean[sum+1];
            for(int target=1;target<=sum ; target++){
                boolean nottake= prev[target];
                boolean take=false;
                if(target >= nums[idx]) take=prev[target-nums[idx]];

                curr[target]= take|nottake;
            }
            prev=curr;
        }
 
        return prev[sum];
    }

    
}