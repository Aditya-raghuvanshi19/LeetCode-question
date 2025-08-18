class Solution {
    public boolean canJump(int[] nums) {
        //here we traverse the array for check and by traversing we can go to end ,but acc to question we can only reached at a index if it comes by adding value with the index i.e. the max index we can reached , if we traverse and reched at a index which is not possible acc to question the answer will be false becuase we can only at max reached at that index which is in maxjump
        int maxjump=0;
        for(int i=0;i<nums.length;i++){
           if(i>maxjump)return false;
           int jump=i+nums[i];
           maxjump=Math.max(maxjump,jump);
        }
        return true;
    }
}