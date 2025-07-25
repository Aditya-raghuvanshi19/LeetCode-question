class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //in the going from columm than row in the L shape directiion we found that it is incresing and anywhere else it is not continuously sorted 
        //ex: 1,4,7,11,15,19,22,24,30 

        //so putting low at the starting of row and high at the end of row elem ex: 15 
        //if high is greater than target it means that column below to high is useless ex: 19,22,24,30
        //so its better to leave them and move high--; same goes for low 
        //low goes top to bottom high goes right to left

        int low=0;
        int high=matrix[0].length-1;

        while(low < matrix.length && high>=0){
            if(matrix[low][high] == target)return true;//if ask index return array of low,high 
            //new int[]{low,high};
            else if(matrix[low][high] > target) high--;
            else
            low++;
        }
        return false;//new int[]{-1,-1};
    }
}