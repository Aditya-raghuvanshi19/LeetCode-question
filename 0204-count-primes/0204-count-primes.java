class Solution {
    int simpleSieve(int n){
        if(n==0||n==1)
        return 0;
        boolean bool[] = new boolean[n];
        Arrays.fill(bool,true);
        bool[0]=bool[1]=false;
        int count=0;

        for(int i=2; i<=Math.sqrt(n); i++){
            for(int j = i*i; j<n; j+=i){
                if(bool[j]){
                    bool[j] = false;
                }
            }
        }
        for(boolean f: bool){
            if(f)
            count++;
        }
        return count;
    }
   
    public int countPrimes(int n) {
    
    if(n==0||n==1)
    return 0;
        return simpleSieve(n);
    }
}