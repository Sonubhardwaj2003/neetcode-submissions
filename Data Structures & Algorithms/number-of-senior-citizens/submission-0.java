class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        for(String s:details){
            String str=s.substring(11,13);
            int age=Integer.parseInt(str);
            if(age>60){
                res++;
            }
        }

        return res;
    }
}