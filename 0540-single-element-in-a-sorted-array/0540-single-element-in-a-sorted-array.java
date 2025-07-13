class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=1;
        int e=nums.length-2;
        int n=nums.length;
        if(n==1)return nums[0];
        if(nums[0] != nums[1])return nums[0];
        if(nums[n-1]!= nums[n-2])return nums[n-1];
        //aboe are edge case , can't check on the border of array
        while(s<=e){
            int mid=(s+e)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])//if left to mid or right to the mid is not equal to mid than it is single elem.
            return nums[mid];

            if((mid % 2 ==0 && nums[mid]==nums[mid+1]) ||(mid%2==1 && nums[mid]==nums[mid-1]) ){//we are on left and element is at right so, eliminate left half.(even , odd) 
                s=mid+1;
            }else//we are on right and elemnt is oon left so, eleminate the right half. (odd,even)
            e=mid-1;
            
        }
        return -1;
    }
}