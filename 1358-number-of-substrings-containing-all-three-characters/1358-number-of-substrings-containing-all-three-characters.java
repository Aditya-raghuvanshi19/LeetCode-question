class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastseen={-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            lastseen[s.charAt(i)-'a']=i;//it update the last seen of character
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1)//if all the char a,b,c are found and their location is store in the array 
            { //we choose minimum among the location and +1 to that is the number of subarray which can be generate with the help of left side character of string from that location which ending with character whatever a,b,c which found in the last.
                count =count+ 1+ Math.min(Math.min(lastseen[0],lastseen[1]),lastseen[2]);
            }
        }
        return count;
    }
}