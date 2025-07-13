class Solution {
    public int search(int[] nums, int target) {
        //first apply binary search and find the sorted half , and check does target lies on the sorted half .if it lies perform bs in that sorted if not lies in thaat move either left or right in other half accourding to the remaining half

        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;

            if(nums[mid]==target)return mid;
            else if(nums[s]<=nums[mid]){//it means it is sorted array(left portion)
              if(nums[s]<= target && target <= nums[mid]){
                e=mid-1;
              }else
              s=mid+1;
            }else{
                 if(nums[e]>= target && target >= nums[mid]){//it means it is sorted array(right  portion)
                s=mid+1;
              }else
              e=mid-1;
            }

        }
        return ans;
    }
}