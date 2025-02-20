class Solution {
    public int reverse(int x) {
        int rev=0;
        int sign=1;
        if(x<0){
            sign=-1;
            x *=-1;

        }
        
        
        while(x>0){
            int rem=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && rem>Integer.MAX_VALUE%10 )
            return 0;

            rev=rev*10+rem;
            x /=10;

        }
        

        return rev*sign;
    }
}