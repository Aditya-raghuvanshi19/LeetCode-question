class Solution {
    public  int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int index=0;
        Deque<Integer> dq=new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){//we are building the dq in descresing order conataing larger element at the begening so that for a particular window take the large element from the front;

           if(!dq.isEmpty()  && dq.peekFirst() <= i-k)//it means the left side is in out of the window size so remove them 
           dq.pollFirst();

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
            dq.pollLast();

            dq.addLast(i);

            if(i>= k-1) ans[index++]= (nums[dq.peekFirst()]);
        }
        return ans;

    }
}