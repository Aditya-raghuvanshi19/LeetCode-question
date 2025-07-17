class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxweight=0;
        int totalweight=0;
        for(int i:weights){
            maxweight=Math.max(i,maxweight);
            totalweight += i;
        }
        int s=maxweight;
        int e=totalweight;
        int n=weights.length;
        while(s<=e){
            int mid= s+(e-s)/2;

            int totalday=1; //start to load from the first day
            int sum=0;
             for (int i = 0; i < weights.length; i++) {
                if (sum + weights[i] > mid) {
                    totalday++;     // Need new day
                    sum = 0;
                }
                sum += weights[i];  // Add to current day's load
            }

            if(totalday <= days){
                e=mid-1;
            }else
            s=mid+1;
        }
        return s;
    }
}