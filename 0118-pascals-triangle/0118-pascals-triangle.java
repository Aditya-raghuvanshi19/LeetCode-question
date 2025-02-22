class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
      
    
       for(int row=1;row<=numRows;row++){
         List<Integer>l1=new ArrayList<>();
         int ans=1;
         l1.add(1);//for the zeroth column element added
        for(int column=1;column<row;column++){ //as we are going zero based indexing
       
        ans=ans*(row-column);
        ans=ans/column;
        l1.add(ans);
       }
       l.add(l1);
       }
       
       return l;

    }
}