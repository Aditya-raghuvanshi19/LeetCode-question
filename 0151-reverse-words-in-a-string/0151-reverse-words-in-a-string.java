class Solution {
    public String reverseWords(String s) {
        String ans="";
        String[] arr=s.trim().split("\s+");
        for(int i=arr.length-1;i>=0;i--){
            if(i==0)
            ans=ans+arr[i];
            // else if(arr[i]==" ")

            else
            ans=ans+arr[i]+" ";
        }
        return ans;

    }
}