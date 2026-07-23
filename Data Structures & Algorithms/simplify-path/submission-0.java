class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String s[]=path.split("/");
        
        for(String str:s){
            if(str.equals("") || str.equals(".")){
                continue;
            }

            if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(str);
            }
        }

        if(st.isEmpty()){
            return "/";
        }

        StringBuilder sb=new StringBuilder();
        for(String dir:st){
            sb.append("/").append(dir);
        }

        return sb.toString();
    }
}