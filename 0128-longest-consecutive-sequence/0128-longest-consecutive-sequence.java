class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            ans.add(nums[i]);
        }
        int longest=0;
        for(int el:ans){
            if(!ans.contains(el-1)){
                //int x=el;
                int count=1;
                while(ans.contains(el+1)){
                    count++;
                    el+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}