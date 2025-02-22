class Solution {
    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int [] arr ,int i){
        int end=arr.length-1;
        int start=i;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        i--;

        if(i>=0){
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i])
            j--;

            swap(nums,i,j);
        }

        reverse(nums,i+1);
    }
}