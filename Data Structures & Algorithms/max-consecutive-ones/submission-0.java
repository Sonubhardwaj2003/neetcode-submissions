class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxOnes=0;
        int i=0;int j=0;
        while(i<n){
            if(nums[i]==1){
                j=i;
                i++;
                while(i<n && nums[i]==1){
                    i++;
                }
                maxOnes=Math.max(maxOnes,i-j);
            }else{
                i++;
            }

        }

        return maxOnes;
    }
}