class Solution {
    public static int[] dp;
    public int countstep(int n){
       if(n==0)return 1;
        if(n==1)return 1;
        
        if(dp[n]!=-1)return dp[n];
        int l=countstep(n-1);
        int r=countstep(n-2);
        int totalways=l+r;
        dp[n]= totalways;
        return totalways;
        
    }
    public int climbStairs(int n) {
        //on each stair i have two option either step 1 or step 2 so it goes like a recursion tree where a node have two child one for one step and one for two step
        //consider it as going down not climbing

        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return countstep(n);
        


    }
}