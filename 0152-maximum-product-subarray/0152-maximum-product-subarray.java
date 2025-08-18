class Solution {
    public int maxProduct(int[] nums) {
        // int prod=1;
        // int maxpro=Integer.MIN_VALUE;
        // for(int i:nums){
        //     prod *= i;
        //     maxpro=Math.max(maxpro,prod);
        //     if(prod==0)
        //     prod=1;
           
        // }
        // return maxpro;
        //the above sol works only if thier is even number of negative because in that case the product of entire array will give you the max prod if zero not occurs if zero occur we handle it by zero
        //but if the negative number comes odd number of times so in that case the prod before the last negative number can give the max prod(prefix prod) orr product after the first negatuve will give the max pro(suffix prod) because on including the odd no's negative will lead negative or can say less prod 
        //better to proceed from the both side

        int pre=1;
        int max=Integer.MIN_VALUE;
        int suff=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            pre *= nums[i];
            suff *= nums[n-i-1];
            max=Math.max(max,Math.max(pre,suff));
            if(pre==0)pre=1;
            if(suff==0)suff=1;
        }
        return max;
    }
}