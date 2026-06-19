class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs=new HashSet<>();
        for(String s:emails){
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<s.length()){
                char ch=s.charAt(i);
                if(ch=='.'){
                    i++;
                    continue;
                }
                else if(ch=='+'){
                    i++;
                    while(i<s.length() && s.charAt(i)!='@'){
                        i++;
                    }
                }
                else if(ch=='@'){
                    sb.append(s.substring(i,s.length()));
                    break;
                }else{
                    sb.append(ch);
                    i++;
                }
            }
            hs.add(sb.toString());
        }

        return hs.size();
    }
}