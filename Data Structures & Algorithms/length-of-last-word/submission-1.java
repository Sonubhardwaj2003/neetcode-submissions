class Solution {
    public int lengthOfLastWord(String s) {
        // String str=s.trim();
        // int i=str.length()-1;
        // if(str.charAt(i)==' ') i=i-1;
        // int j=i; 
        // while(i>=0){
        //     if(str.charAt(i)==' ') break;
        //     i--;
        // }

        // return j-i;
        String str=s.trim();
        int count=0;
        int i=str.length()-1;
        while(i>=0 && str.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}