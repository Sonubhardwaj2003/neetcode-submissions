class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        char ch1=s.charAt(0);
        for(int i=1;i<s.length();i++){
            char ch2=s.charAt(i);
            sum+=Math.abs((ch1-'a')-(ch2-'a'));
            ch1=ch2;
        }

        return sum;
    }
}