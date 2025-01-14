class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] indexes=new int[2];
        Map<Integer,Integer> nummap=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            int more=target-nums[i];
            if(nummap.containsKey(more))
            {
                indexes[0]=i;
                indexes[1]=nummap.get(more);
            }
            nummap.put(nums[i],i);
        }
        return indexes;
    }
}