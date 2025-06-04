class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[nums.length];

        for(int i=2*nums.length-1;i>=0;i--){
            int index=i%n;
            int num=nums[index];
            
            while(!st.isEmpty() && st.peek() <= num) st.pop();
            
            if(i<n){
                if(st.isEmpty())ans[i]=-1;
            else ans[i]=st.peek();
            }
           

            st.push(num);
        }
        return ans;


    }
}