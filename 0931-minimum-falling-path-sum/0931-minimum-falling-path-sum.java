class Solution {
    public int f(int i,int j,int n,int[][] matrix,Integer[][] dp){
        if(j<0 || j>=n)return (int)1e9;
        if(i==0){
            dp[i][j] = matrix[0][j];
            return dp[i][j];
           
        }
        if(dp[i][j] != null)return dp[i][j];
        int top=matrix[i][j] + f(i-1,j,n,matrix,dp);
        int leftdiagonal=matrix[i][j] + f(i-1,j-1,n,matrix,dp);
        int rightdiagonal=matrix[i][j] + f(i-1,j+1,n,matrix,dp);

        return dp[i][j]=Math.min(top,Math.min(leftdiagonal,rightdiagonal));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        Integer[][] dp=new Integer[n][n]; //this single dp matrix will give store the min cost fromm going from index(i,j) to the 0th row by going through all the 3 ways-> left diagonl,top,right diagonal, and by any f(i,j) we need to find min path we can use this dp


        for(int i=0;i<n;i++){
           dp[n-1][i]=f(n-1,i,n,matrix,dp);
        }
        int mini=dp[n-1][0];
        for(int i=1;i<n;i++){
            mini=Math.min(mini,dp[n-1][i]);
        }
        return mini;

    }
}