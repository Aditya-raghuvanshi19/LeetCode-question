class Solution {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr,int i){
        int s=i;
        int e=arr.length-1;
        while(s<=e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])//we first find the border elemnt which need to be swap because  in the incresing order of number this number is smaller for making nummber lecogarphical greater we replace this number with the slightly greater than that 
        i--;
        
        int j=nums.length-1;
        if(i>=0){
          while(j>=0 && nums[j] <= nums[i])
          j--;
          //after this we reached at the elem which is slightly greater than the border elem for making lecso greater we need to swap i with slight greater
          swap(nums,i,j);
        
        }

        reverse(nums,i+1);//after all the process we have to swap because the elem just next to border to greater than all of the next but in leco it need to be smaller
        //ex- 456498632 -> we found 3 is border the range of 9 to 2 the just greater is 6 
        // 456698432 -> this is greater permutation but not lexico for making this we have to do 4566 (98432)-> 23489 =>  456623489 is in lexco
        

    }
}