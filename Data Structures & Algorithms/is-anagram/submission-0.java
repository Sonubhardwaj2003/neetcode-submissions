class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int as[]=new int[26];
        Arrays.fill(as,0);
        int at[]=new int[26];
        Arrays.fill(at,0);

        for(int i=0;i<s.length();i++){
            int sv=(int)s.charAt(i)-97;
            int tv=(int)t.charAt(i)-97;

            as[sv]++;
            at[tv]++;
        }

        for(int i=0;i<26;i++){
            if(as[i]!=at[i]) return false;
        }

        return true;
    }
}
