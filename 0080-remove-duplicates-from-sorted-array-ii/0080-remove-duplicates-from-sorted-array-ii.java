class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       for(int n: nums){
        if(i<2 || n!=nums[i-2]){//this i is check becuase first two value till index 1 is always correct either duplicate or single after that index , if more than two occure store location in i and traverse the array when diff. number found put at the stored location
            nums[i]=n;
            i++;
        }
       }
      return i;

    }
}