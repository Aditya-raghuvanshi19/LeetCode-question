class Solution {
    public boolean f(int idx,int target,int[] nums,Integer[][] dp){
         if(target==0)return true;
         if(idx==0) return nums[0]==target;

         if(dp[idx][target]!= null) return dp[idx][target]==1 ? true : false;

         boolean nottake= f(idx-1,target,nums,dp);
         boolean take=false;
         if(nums[idx] <= target) take=f(idx-1,target-nums[idx],nums,dp);

         dp[idx][target]=  (take | nottake ) ? 1 : 0;

         return  take | nottake;

    }
    public boolean canPartition(int[] nums) {
        // in this question : 
        //if we have to check exactly for two subset and both must have total sum equals than it mean the sum of one of the subset is totalsum/2
        // let sum of one subset is x if other subset sum is equal than x+x=2x=totalsum
        //x= totalsum/2 
        // we only have to check that is their exist any subset whose sum=totalsum/2

        int n=nums.length;
        int totalsum=0;
        for (int i:nums) totalsum+=i;
        
        if(totalsum %2 ==1)return false ; 
        Integer[][] dp=new Integer[n][totalsum/2+1];

        return  f(n-1,totalsum/2,nums,dp);


    }
}