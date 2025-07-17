class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxe=Integer.MIN_VALUE;
        for(int i:nums){
            maxe=Math.max(maxe,i);
        }
        int n=nums.length;
        int s=1;
        int e=maxe;
        int ans=Integer.MAX_VALUE;

        while(s<=e){
            int mid=(s+e)/2;

            long totalres=0;

            for(int i:nums){
                totalres += (i+mid-1)/mid;
            }

            if(totalres <= threshold)
            e=mid-1;
            else
            s=mid+1;
        }
        return s;
    }
}