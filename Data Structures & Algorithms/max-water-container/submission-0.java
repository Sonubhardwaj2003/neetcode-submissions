class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int i=0;int j=heights.length-1;
        while(i<j){
            int side=Math.min(heights[i],heights[j]);
            maxWater=Math.max(maxWater,side*(j-i));

            if(side==heights[i]) i++;
            else j--;
        }

        return maxWater;
    }
}
