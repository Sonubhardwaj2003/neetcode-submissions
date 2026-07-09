class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int rotate=k%n;
        int res[]=new int[n];
        
        for(int i=0;i<n-rotate;i++){
            res[i+rotate]=nums[i];
        }
        int r=0;
        for(int i=n-rotate;i<n;i++){
            res[r++]=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}