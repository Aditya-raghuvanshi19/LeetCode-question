class Solution {
    public boolean ispalin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
            return false;

            i++;
            j--;
        }
        return true;

    }
    public String longestPalindrome(String s) {
        int l=0;
        int r=0;
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                 if(ispalin(s.substring(i,j+1))){
                if((j-i+1)>max){
                   ans=s.substring(i,j+1);
                   max=Math.max(max,j-i+1);
                }
            }
            }
        }
           
      
        return ans;
        
    }
}