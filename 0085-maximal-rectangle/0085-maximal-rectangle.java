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
    public int maximalRectangle(char[][] matrix) {

         if (matrix.length == 0 || matrix[0].length == 0) return 0;

        int maxrect=0;
         int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] temp = new int[rows][cols];

        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if (j == 0) temp[j][i] = (matrix[j][i] == '1') ? 1 : 0;

                else if(matrix[j][i]=='0'){
                      temp[j][i]=0;
                }else{
                     temp[j][i]=temp[j-1][i]+1;
                }
               
            }
        }
        for(int i=0;i<matrix.length;i++){
           maxrect=Math.max(maxrect,largestRectangleArea(temp[i]));
        }
        return maxrect;
    }
}