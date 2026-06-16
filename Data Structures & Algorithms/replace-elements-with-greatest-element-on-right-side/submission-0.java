class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        ans[n-1]=-1;
        int rightMax=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=rightMax;

            rightMax=Math.max(rightMax,arr[i]);
        }

        return ans;
    }
}