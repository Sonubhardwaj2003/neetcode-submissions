class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=speed.length;
        for(int i=0;i<n;i++){
            map.put(position[i],i);
        }

        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->{
            return b.getKey()-a.getKey();
        });

        Stack<Double> st=new Stack<>();
        for(int i=0;i<n;i++){
            int pos=list.get(i).getKey();
            int sp=speed[list.get(i).getValue()];
            double val=(double)(target-pos)/sp;
            if(!st.isEmpty() && st.peek()<val){
                st.push(val);
            }else if(st.isEmpty()){
                st.push(val);
            }
        }

        return st.size();
    }
}
