class Solution {
    public int simplesieve(int n){
        int count=0;
        boolean bool[] = new boolean[n];
        Arrays.fill(bool,true);
        bool[0]=false;
        bool[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=i*i; j<n; j+=i){
                if(bool[j])
                bool[j]=false;
            }
        }
        for(boolean b: bool){
            if(b)count++;
        }
        return count;
    }
    public int countPrimes(int n) {
        if(n==0 || n==1)return 0;
        return (simplesieve(n));
    }
}