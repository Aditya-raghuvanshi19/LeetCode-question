class Solution {
    public void swap(int i,int j , int[] arr){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        swap(0,nums.length-1,nums);//for left rotaion this is done in the last , rest is exactly same
        swap(0,k-1,nums);
        swap(k,nums.length-1,nums);
       
    }
}