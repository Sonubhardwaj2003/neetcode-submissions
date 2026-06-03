class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            if (Character.isLetterOrDigit(s.charAt(k))) {
                sb.append(s.charAt(k));
            }
        }

        s=sb.toString();

        int i=0;int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }
}
