class Solution {
    public int maximum69Number (int num) {
        String numb=num+"";
        char[] arr=numb.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6')
            {
            arr[i]='9';
            break;
            }
        }
        String s="";
        for(char c:arr)
        s+=c;
        
        int n=Integer.parseInt(s);
        return n;
    }
}