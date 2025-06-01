class Solution {
    public String minWindow(String s, String t) {
        int [] hash=new int[256];
        int l=0,r=0,minlen=Integer.MAX_VALUE,start=-1;
        for(int i=0;i<t.length();i++)hash[t.charAt(i)-'A']++;//this is pre store the character of string t

        int count=0;
        while(r<s.length()){
             if(hash[s.charAt(r)-'A']>0)//it means character is already inserted by t and freqiency is more  than 0
             count++;
            
              hash[s.charAt(r)-'A']--;//decrease the feq , if not present than it goes -1,-2 -ve freq.
              

              while(count==t.length()){//it means we rech the string at which we get all the character of t in s.

               if(r-l+1 < minlen ){
                minlen=r-l+1;
                start=l;
               }
              
               
              
                hash[s.charAt(l)-'A']++;
                if(hash[s.charAt(l)-'A']>0)count--; //if it becoome +ve menas we again insert more into the map 
                //and if still count is +ve it means the left value is unneseccasry increase left side size
                l++;


              }

             r++;

        }
        return (start==-1) ? "" :s.substring(start,start+minlen);
    }
}