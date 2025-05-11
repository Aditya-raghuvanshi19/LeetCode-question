class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else if(!st.isEmpty() && c==')'){
                if(st.peek()!='(') return false;
                st.pop();
            }else if(!st.isEmpty() && c=='}'){
                if(st.peek()!='{') return false;
                st.pop();
            }else if(!st.isEmpty() && c==']'){
                if(st.peek()!='[') return false;
                st.pop();
            }else{
                return false;
            }

        }
        
        if(st.isEmpty())return true;
        return false;
    }
}