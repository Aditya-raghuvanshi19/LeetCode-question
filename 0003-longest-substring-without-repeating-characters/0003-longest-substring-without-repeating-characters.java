class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int maxl=0;

        while(r<s.length()){
           char ch=s.charAt(r);
        
           if(mp.containsKey(ch) && mp.get(ch)>=l){//here l should also check because the given index must me forward to l , than l must be shift.

            l=mp.get(ch)+1;
            
            
           }
            int len=r-l+1;
            maxl=Math.max(maxl,len);
            mp.put(s.charAt(r),r);
            
           r++;
        }
        return maxl;
    }
}