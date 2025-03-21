class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxone=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int swap=0;
        for(end=0;end<nums.length;end++){
            if(nums[end]==0)
            swap++;

            while(swap>k){
                if(nums[start]==0)
                swap--;

                start++;
            }
            maxone=Math.max(maxone,end-start+1);
        }
        return maxone;
    }
}