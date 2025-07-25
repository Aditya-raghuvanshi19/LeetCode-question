class Solution {
    public int findPeakElement(int[] nums) {
        int s=1;
        int e=nums.length-2;
        int n=nums.length;
        
        if(n==1)return 0;
        if(nums[0] > nums[1])return 0;
        if(nums[n-1]> nums[n-2]) return n-1;

        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])return mid;

            else if(nums[mid]>nums[mid-1])s=mid+1;
            else e=mid-1;
        }
        return -1;

    }
}