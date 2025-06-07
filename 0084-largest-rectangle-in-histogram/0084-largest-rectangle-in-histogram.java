class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack();
        int maxarea=0;
        //we need to find nse and pse for findin the width of the rectangle
        //area = heights[i] * (nse-pse-1)
       for(int i=0;i<heights.length;i++){
        while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int element=heights[st.pop()];
                int nse=i;
                int pse= (st.isEmpty()) ? -1 : st.peek();

                int area= element * (nse-pse-1);

                maxarea=Math.max(maxarea,area);

        }
        st.push(i);
       }

       while(!st.isEmpty()){
              int element=heights[st.pop()];
                int nse=heights.length;
                int pse= (st.isEmpty()) ? -1 : st.peek();

                int area= element * (nse-pse-1);

                maxarea=Math.max(maxarea,area);

       }
       return maxarea;
    }
}