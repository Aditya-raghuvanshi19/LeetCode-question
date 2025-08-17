class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i< strs[0].length() && j< strs[n-1].length()){

            if(strs[0].charAt(i)==strs[n-1].charAt(j))
           {

           ans.append(strs[0].charAt(i));
           i++;
           j++;
           }
           else
           break;
        }
        return ans.toString();
    }
}