class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();//this is a monotonic stack in a decreasing order
        HashMap<Integer,Integer> mp=new HashMap();//this is used to map the nge of the num2 elemnt correspond to their nge
        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];

            while(!st.isEmpty() && st.peek()<= num)
            st.pop();//pop out till we go the nge

            if(st.isEmpty())//if not got
            mp.put(num,-1);
            else
            mp.put(num,st.peek());//else the top elemnt is the nge
            
            st.push(num);

        }
        int[] ans=new int[nums1.length];//this is to return the ans
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.get(nums1[i]);
        }
        return ans;

    }
}