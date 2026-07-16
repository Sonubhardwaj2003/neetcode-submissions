class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }    

            if(ch==')' && (st.isEmpty() || st.pop()!='(')){
                return false;
            }else if(ch=='}' && (st.isEmpty() || st.pop()!='{')){
                return false;
            }else if(ch==']' && (st.isEmpty() || st.pop()!='[')){
                return false;
            }

        }

        return st.isEmpty();
    }
}
