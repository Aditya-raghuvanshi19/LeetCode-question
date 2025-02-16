class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum=0;
        int maxsum=0;
        for(int i=0;i<=k-1;i++){
            sum +=cardPoints[i];
        }
        maxsum=sum;
        int rightindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum -= cardPoints[i];
            sum +=cardPoints[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,sum);

        }
        return maxsum;
    }
}