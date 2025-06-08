class pair{
    int val;
    int index;

    public pair(int val, int index){
        this.val=val;
        this.index=index;
    }
}
class StockSpanner {
     Stack<pair>st;
     int index;
    public StockSpanner() {
        st=new Stack<>();
        index=-1;
    }
    
    public int next(int price) {
        index++;
        while(!st.isEmpty() && st.peek().val<=price)//implement pge
        st.pop();

        int ans=index - (st.isEmpty() ? -1 : st.peek().index );//from the index diff we find how many number are in between because after that numbers the pge is found
        st.push(new pair(price,index));
        
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */