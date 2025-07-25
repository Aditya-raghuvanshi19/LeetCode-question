class Solution {
    public int findmax(int[]arr){
        int maxel=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxel){
                maxel=arr[i];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        // i can do BS by help of row or column any one of them will work fine

        int low=0;
        int high=mat.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            int column = findmax(mat[mid]);
            int top=mid-1 >= 0 ? mat[mid-1][column] : -1;
            int bottom= mid+1 < mat.length ? mat[mid+1][column] : -1;

            if(mat[mid][column] > top && mat[mid][column] > bottom)return new int[]{mid,column};
            else if(mat[mid][column] < top) high=mid-1;
            else if(mat[mid][column] < bottom)
            low=mid+1;

        }
        return new int[]{-1,-1};
    }
}