class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
           }
        }

        int miss=-1;
        int repeated=-1;

        for(int i=1;i<=n*n;i++){
            if(!mp.containsKey(i))
            miss=i;
            else if(mp.get(i)==2)
            repeated=i;
            if(miss!=-1 && repeated!=-1)
            break;
        }
        int[] ans={repeated,miss};
        return ans;
    }
}