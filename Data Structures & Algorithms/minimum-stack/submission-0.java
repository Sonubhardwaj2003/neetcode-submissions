class MinStack {
    private Stack<Integer> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> tem=new Stack<>();
        int mini=st.peek();

        while(!st.isEmpty()){
            mini=Math.min(mini,st.peek());
            tem.push(st.pop());
        }

        while(!tem.isEmpty()){
            st.push(tem.pop());
        }

        return mini;
    }
}
