class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int maxLen=0;
        int ind=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(hs.contains(ch)){
                hs.remove(s.charAt(ind));
                ind++;
            }

            hs.add(ch);
            int len=hs.size();
            maxLen=Math.max(len,maxLen);
        }

        return maxLen;
    }
}
