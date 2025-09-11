class Solution {
    public int f(int m,int n,int[][]grid,int[][]dp){
        if(m==0 && n==0)return grid[0][0];
        if(m<0 || n<0)return (int)1e9;

        if(dp[m][n]!= -1)return dp[m][n];

        int top=grid[m][n]+f(m-1,n,grid,dp);
        int left=grid[m][n] + f(m,n-1,grid,dp);

        dp[m][n]=Math.min(top,left);

        return dp[m][n];

    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return f(m-1,n-1,grid,dp);
        
    }
}