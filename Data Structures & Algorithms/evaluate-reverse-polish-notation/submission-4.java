class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int res=0;int a;int b;
        for(String s:tokens){
            if(st.size()>1 && (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))){
                a=st.pop();
                b=st.pop();

                if(s.equals("+")){
                    res=(a+b);
                }else if(s.equals("-")){
                    res=(b-a);
                }else if(s.equals("*")){
                    res=(a*b);
                }else if(s.equals("/")){
                    if(a!=0) res=(b/a);
                }

                st.push(res);
            }

            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}
