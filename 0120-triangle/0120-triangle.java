class Solution {
    public int f(int i,int j,int n,List<List<Integer>> triangle,Integer[][] dp){
        if(i==n-1)return triangle.get(n-1).get(j);

        if(dp[i][j] != null)return dp[i][j];

        int down=triangle.get(i).get(j) + f(i+1,j,n,triangle,dp);
        int diagonal=triangle.get(i).get(j) + f(i+1,j+1,n,triangle,dp);

        dp[i][j]=Math.min(down,diagonal);
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        //here multiple ending index so we not start from the last index
        //it's better to start from 0,0 becuase a single starting point
        //here only single base caase if reach at the last row return the value
        //here not out of boundary condition becuase eacch index on top row have diagonal elem in the bottom row
        //to indentify the dp array size the best way is find the max vallue of row and the max value of column

        int n=triangle.size();
        Integer[][] dp=new Integer[n][n];

        return f(0,0,n,triangle,dp);

    }
}