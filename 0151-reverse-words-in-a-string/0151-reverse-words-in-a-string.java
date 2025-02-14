class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String[] arr=s.trim().split("\s+");
        for(int i=arr.length-1;i>=0;i--){
            if(i==0)
            ans=ans.append(arr[i]);
            // else if(arr[i]==" ")

            else
            ans=ans.append(arr[i]+" ");
        }
        return ans.toString();

    }
}