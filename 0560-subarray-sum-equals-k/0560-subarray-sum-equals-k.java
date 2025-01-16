class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> ans= new HashMap<>();
        int count=0;
        int presum=0;
        ans.put(presum,1);
        for(int i=0;i<n;i++){
            presum += nums[i];
            int remain=presum-k;

            count = count + ans.getOrDefault(remain,0);
            ans.put(presum,ans.getOrDefault(presum,0)+1);
        }
        return count;
    }
}