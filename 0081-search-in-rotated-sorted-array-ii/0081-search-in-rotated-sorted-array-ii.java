class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(e+s)/2;
            if(nums[mid]==target)return true;

            if(nums[s]==nums[mid] && nums[mid]==nums[e]){
                //becuase due to this the issue arrises from the duplicate elements got solve , issue is : because of duplicates we are not able to decide which part is sorted, now leave the duplicates from this and go normal
                s = s+1;
                e=e-1;
                continue;
            }

            if(nums[s]<=nums[mid]){//it tells left half is sorted
                    if(nums[s]<=target && target<= nums[mid])
                    e=mid-1;//descard the right half
                    else
                    s=mid+1;
            }else{//if left is not sorted right will defenetly be
                   if(target>=nums[mid] && target<=nums[e])
                   s=mid+1;//descard the left half
                   else
                   e=mid-1;
            }

        }
        return false;
    }
}