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

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//        int l=0;
//        int r=0;
//        int n=nums.length;
//        int maxone=Integer.MIN_VALUE;
//        int zero=0;
//        while(r<n){
//         if(nums[r]==0)zero++;
//         if(zero>k){//due to this code become in O(N) not 2N in erlier their is two while loop which cause 2N.
//             if(nums[l]==0)zero--;
//             l++;
//         }
//         if(zero<=k)
//         maxone=Math.max(maxone,r-l+1);
//         r++;
//        }
//        return maxone;
//     }
// }
