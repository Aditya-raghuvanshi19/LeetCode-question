class Solution {
    public int[] findnse(int [] arr){
          int[] nse=new int[arr.length];
          Stack<Integer> st=new Stack<>();
           int n=arr.length;
          for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            st.pop();

            if(st.isEmpty()) nse[i]=n;
            else
            nse[i]=st.peek();

            st.push(i);

          }
          return nse;
    }
    public int[] findpsee(int [] arr){
          int[] psee=new int[arr.length];
          Stack<Integer> st=new Stack<>();
           int n=arr.length;
          for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i])
            st.pop();

            if(st.isEmpty()) psee[i]=-1;
            else
            psee[i]=st.peek();

            st.push(i);

          }
          return psee;
    }
    public int sumSubarrayMins(int[] arr) {
        long total=0;
        long mod = 1_000_000_007L;    
        //we need to find this that at what index extenson subarray this elemnt is small
        int[] nse= findnse(arr);
        int[] psee=findpsee(arr);

        for(int i=0;i<arr.length;i++){
            int left=i-psee[i];//this isthe number of subarray in the left having arr[i] as min
         int right=nse[i]-i;//this isthe number of subarray in the right having arr[i] as min

            total=(total + (long)(left*right % mod *arr[i])%mod)%mod;
        }
        return (int) total;
    }
}