class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int n=nums.length;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                     l1.add(nums[j]);
                      l1.add(nums[k]);
                      j++;
                      k--;
                      while(j<k && nums[j]==nums[j-1])j++;
                      while(k>j && nums[k]==nums[k+1])k--;
                    l.add(l1);
                }
                else if(sum<0)
                j++;
                else
                k--;
            }
            
        }
        return l;
    }
}