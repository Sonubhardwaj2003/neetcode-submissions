class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=Integer.MAX_VALUE;
        int sum=0;int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>=target){
                size=Math.min(size,i-j+1);

                while((sum-=nums[j])>=target && j!=nums.length){
                    j++;
                }
                sum+=nums[j];
                size=Math.min(size,i-j+1);
            }
        }

        return size==Integer.MAX_VALUE?0:size;
    }
}