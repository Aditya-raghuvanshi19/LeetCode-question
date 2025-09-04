class Solution {
    public int f(int[] nums){
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
         
       
        for(int i=1;i<n;i++){

            int take=nums[i];
            if(i>1)take+=dp[i-2];
            int nottake=0+dp[i-1];
           
            dp[i]=Math.max(take,nottake);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        //create 2 array one with the first el and not last , and one with last el but not first , whichever array gives max that will be answer 
        int n=nums.length;
       int[] temp1=new int[n-1];
       int[] temp2=new int[n-1];
       for(int i=0;i<n;i++){
        if(i != 0) temp1[i-1]=nums[i];
        if(i != n-1) temp2[i] = nums[i];
       }

       if(n==1)return nums[0];

       return Math.max(f(temp1),f(temp2));
           
    }
}