class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash =new int[26];
        int l=0,r=0;
        int n=s.length();
        int maxf=0,maxlen=0;
        while(r<n){
          hash[s.charAt(r)-'A']++;
          maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
          if(r-l+1-maxf>k){
            hash[s.charAt(l)-'A']--;
            l++;
          }
          else{
            maxlen=Math.max(maxlen,r-l+1);
          }
          r++;

        }
        return maxlen;
    }
}