class Solution {
    public int findcount(int[] arr,int goal){//i am finding the number of subarray whoes sum is <=goal.

    int l=0;
    int r=0;
    int sum=0,count=0;
    while(r<arr.length){
        if(goal<0)return 0;
        sum+=arr[r];
        while(sum>goal){
            sum-=arr[l];
            l++;
        }
        count+=r-l+1;
        r++;
    }
    return count;
        
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       int count1=findcount(nums,goal);
        int count2=findcount(nums,goal-1);
        return count1-count2;
    }
}