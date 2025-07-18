class Solution {
    public int findKthPositive(int[] arr, int k) {
      int s=0;
      int e=arr.length-1;

      while(s<=e){
        int mid=(s+e)/2;
        int missing=arr[mid] - (mid+1);
        if(missing >= k){
            e=mid-1;
        }
        else
        s=mid+1;
      }//s cross the e and s=e+1
      return  s+k; 
    }
}