class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int ans=0;
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        for(int i=0;i<s.length()-1;i++){//for checking the next character we run loop till n-2 the n-1 character is not get consider here.
            if(mp.get(s.charAt(i))>=mp.get(s.charAt(i+1)))
            ans=(ans+mp.get(s.charAt(i)));
            else
            ans=(ans-mp.get(s.charAt(i)));
        }
      ans=(ans+mp.get(s.charAt(s.length()-1)));//here the last character at n-1 index get executed and it is always +ve {try to do dry run}
        return ans;
    }
}