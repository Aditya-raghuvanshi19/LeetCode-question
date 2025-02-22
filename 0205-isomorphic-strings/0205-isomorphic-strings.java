class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        else{
            HashMap<Character,Character> mp1=new HashMap<>();//for store mapping of s with t
            HashMap<Character,Boolean> mp2=new HashMap<>();//for stor the flag for 
            for(int i=0;i<s.length();i++){//both the string of equal size take any
                char ch1=s.charAt(i);
                char ch2=t.charAt(i);
                if(mp1.containsKey(ch1)){
                    if(mp1.get(ch1)!=ch2)//now we are check the condition where mapping fail
                    return false;
                }
                else{
                    if(mp2.containsKey(ch2)){
                        return false;//if mp1 not contains that key,and the ch2 is mapp with someone

                    }
                    else{//if no false return till now mapp the ch1 with ch2 and mark ch2 flag true
                        mp1.put(ch1,ch2);
                        mp2.put(ch2,true);
                    }
                }
            }
        }
        return true;
    }
}