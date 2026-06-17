class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;int j=0;
        // StringBuilder sb=new StringBuilder();
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                // sb.append(s.charAt(i));
                i++;
            }
            j++;
        }

        // return sb.toString().equals(s);
        return i==s.length();
    }
}