class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int val:nums){
            if(val>0){
                max=Math.max(val,max);
                hs.add(val);
            }
        }
        //hs doesn't contain any positive number
        if(hs.size()==0) return 1;

        for(int i=1;i<=max+1;i++){
            if(!hs.contains(i)){
                return i;
            }
        }

        return 0;
    }
}