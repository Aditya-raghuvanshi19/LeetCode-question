class Solution {
    public int longestPalindrome(String s) {
        int [] arr=new int[128];
        for(char c: s.toCharArray())
        arr[c]++;

        int res=0;
        for(int i=0;i<128;i++){
            int val=arr[i];
            if(val%2==0)//if the frequncy of char is even we can take the whole character because if 4-> 2 left side 2 right side
            res=res+val;
            else if(val%2!=0){//but if it is in odd number 
                res+=val-1;//we take one less because the same above even logic if 5 take 4
                if(res%2==0)//but still the longest palindrome have even number of char we can add one more thet left of odd number char in between even-> 4 left 1 mid 4 right
                res++;//increae that one 
            }
        }
        return res;
    }
}