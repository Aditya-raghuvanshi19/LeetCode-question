class Solution {
    public int findcount(int[] arr,int goal){ //i am finding the number of subarray whoes sum of add number is <=goal.

    int l=0;
    int r=0;
    int sum=0,count=0;
    while(r<arr.length){
        if(goal<0)return 0;
        sum+=arr[r]%2;
        while(sum>goal){
            sum-=arr[l]%2;
            l++;
        }
        count+=r-l+1;//here is the subarray sum so for each right movent of r comes up with the size of current window as a count of subarray.
        r++;
    }
    return count;
        
    }
    public int numberOfSubarrays(int[] nums, int k) {//this is exactly similar to 930.
         int count1=findcount(nums,k);
        int count2=findcount(nums,k-1);
        return count1-count2;//apply simple math here
    }
}