class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int proL=1;
       int proR=1;
       for(int i=n-1;i>=0;i--){
        ans[i]=proR;//here because the last el not have any right element
        proR *=nums[i];
       }
       for(int i=0;i<n;i++){
        ans[i]=ans[i]*proL;//now the stored right product is multipled by the leftproduct so that the combine product is the ans.
        proL *=nums[i];
       }
       return ans;
    }
}