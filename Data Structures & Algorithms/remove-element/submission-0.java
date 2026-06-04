class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int v:nums){
            if(v==val){
                c++;
            }
        }
        int k=nums.length-c;

        int e[]=new int[k];int i=0;
        for(int v:nums){
            if(v!=val){
                e[i++]=v;
            }
        }

        i=0;
        for(int v:e){
            nums[i++]=v;
        }

        return k;
    }
}