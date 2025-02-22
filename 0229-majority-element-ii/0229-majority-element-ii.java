class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>l=new ArrayList<>();
       
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums.length;i++){
        if(cnt1==0 && nums[i]!=el2){//this is because if not check edge case,the same element will  pointed                         //  by the both el1 and el2 , but we should allot both for different element.
            el1=nums[i];
            cnt1=1;
        }else if(cnt2==0 && nums[i] !=el1){
             el2=nums[i];
            cnt2=1;

        }
        else if(nums[i]==el1)
        cnt1++;
        else if(nums[i]==el2)
        cnt2++;
        else{
        cnt1--;
        cnt2--;
        }

    }
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1)
            count1++;
            if(nums[i]==el2)
            count2++;

        }
         if(count1>nums.length/3){
            l.add(el1);
         }
         if(count2>nums.length/3){
            l.add(el2);
         }
        
        return l;
      
    }
}