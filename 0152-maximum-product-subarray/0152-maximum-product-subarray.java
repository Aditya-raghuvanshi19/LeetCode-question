class Solution {
    public int maxProduct(int[] nums) {
       int pre=1;
       int suff=1;
       int n=nums.length;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(pre==0)//here we check it first because in the new iteration we do not want to take the zero so before further multiply we first set it as one, but if 
         pre=1;
        if(suff==0)
        suff=1;
        pre *=nums[i];//after multiply we check the condition than we set the value 1 and the corrent going iteration fails, it may be that in the currebntn iteration the 0 will be the max and the max sum we go 0 for better dry run the test case Input: nums = [-2,0,-1] Output: 0
        suff *= nums[n-i-1];
        
        max=Math.max(max,Math.max(pre,suff));
       }
       return max;
    }
}