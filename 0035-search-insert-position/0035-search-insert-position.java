class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int n=nums.length;
        int e=n-1;
        int mid=0;
        while(s<=e){
            mid=(s+e)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid] > target) e=mid-1;
            else
            s=mid+1;
        }
        return s;
        
    }
}