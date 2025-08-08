class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)return false;
        int opt=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num % i==0){
                opt += i;
                if(num / i != i && num / i != num)
                opt += num/i;
            }
        }
        if(opt==num)return true;
        return false;
    }
}