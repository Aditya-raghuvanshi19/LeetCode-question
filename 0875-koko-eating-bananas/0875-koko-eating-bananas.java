class Solution {
    public static long func(int [] piles,int k){
        long totalh=0;
        for(int i:piles){
            totalh += (i + k - 1) / k;//Math.ceil(i/k);//ceil because if any banana left than k he eat and not eat more in that hour
        }
        return totalh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans=Integer.MAX_VALUE;
        int s=1;
        int n=piles.length;
        int maxe=Integer.MIN_VALUE;
        for(int i:piles){
            maxe=Math.max(i,maxe);
        }
        int e=maxe;//end will be on the max element present in the array .
        //now s and e create a range among this range we need to find the minimum one as a value of k 
        while(s<=e){
            int mid=s+(e-s)/2;
            long totalhours=func(piles,mid);//now checking how many times it take if we let k=mid

            if(totalhours <= h){
                    ans=Math.min(ans,mid);
                    e=mid-1;
            }
            else
            s=mid+1;
        }
        return ans;
    }
}