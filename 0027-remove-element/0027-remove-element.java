class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int i=0;
//        for(int n:nums){
//         if(n!=val)
//         nums[i++]=n;
//        }
//        return i;
//     }
// }
