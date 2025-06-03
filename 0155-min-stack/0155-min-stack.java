class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st=new Stack();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min=val;
        }else{
            if(val<min){
                long newval=(long) 2*val-min;//this is do so that we not store the min value itself on top because in pop we can loss our min val;
                st.push((long)newval);
                min=val;
            }
            else
            st.push((long) val);
        }
    }
    
    public void pop() {
       if(st.isEmpty())return ;
       long x= st.pop();
       if(x<min)//it means the value is modified.
       {
        Long oldmin=(long) 2*min-x;//solve through above equation
       //now the curr min is become the top value and old min is assign to current min
        min=oldmin;
       }
    }
    
    public int top() {
        if(st.isEmpty())return -1 ;
       long x=st.peek();
       if(x<min)//it means the value is modified.
       {
         return (int)min;
       }
       return (int) x;
    }
    
    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */