class Solution {
    public int fun(int [] arr, int mid){
        int countarr=1;
        int elemsum=0;
        for(int i:arr){
            if(elemsum + i <= mid){
                 elemsum += i;
            }else{
                countarr++;
                elemsum= i;
            }
        }
        return countarr;
    }
    public int splitArray(int[] nums, int k) {
        if(nums.length < k)return -1;
        int low=0;
        int high=0;
        for(int i: nums){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid=(low+high)/2;
            int countarr=fun(nums,mid);

            if(countarr > k){
                low=mid+1;
            }else
            high=mid-1;

        }

        return low;

    }
}