class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");

        Stack<Integer> st=new Stack<>();
        int num=0;
        char sign='+';

        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }

            if(!Character.isDigit(ch) || i==s.length()-1){
                if(sign=='+'){
                    st.push(num);
                }else if(sign=='-'){
                    st.push(-num);
                }else if(sign=='*'){
                    st.push(st.pop()*num);
                }else if(sign=='/'){
                    st.push(st.pop()/num);
                }

                sign=ch;
                num=0;
            }

            i++;
        }

        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }

        return res;
    }
}