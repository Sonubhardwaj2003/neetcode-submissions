class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n) return e.getKey();
        }
        return 0;
    }
}