class Solution {
    public int rob(int[] nums) {
        //doing with the tabulation to reduce the stack space
        int n=nums.length;
        int[] dp=new int[n];

        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int take=nums[i] ;
            if(i>1) take+=dp[i-2]; //if i is less that or equal to 1 than i-2 leads to index out of bound , for taking the best max sum till i-2 index from the dp

            int nottake= 0 + dp[i-1];

            dp[i]=Math.max(take,nottake);
        }
        return dp[n-1]; //at the last index we store the best max sum till that index;
    }
}