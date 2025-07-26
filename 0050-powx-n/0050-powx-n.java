class Solution {
    public double pow(double x, long n){
        if(n==0)return 1.0;

        if(n%2==0)return pow(x*x,n/2);//it is because : 20 ^ 10 => 20^2^5 => (20*20)^5 , x^n = (x*x)^(n/2)
        else
        return x*pow(x*x,n/2);// 20^11 => 20^1 * 20^10 => 20 * (20 ^ 10 => 20^2^5 => (20*20)^5) , x^n = x * (x*x)^(n/2)
    }
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            N=-n;
            return pow(1/x,N);
        }
        return pow(x,N);

    }
}