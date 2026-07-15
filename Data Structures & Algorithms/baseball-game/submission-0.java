class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+") && st.size()>1){
                st.push(st.get(st.size()-1)+st.get(st.size()-2));
            }else if(operations[i].equals("C") && st.size()>0){
                st.pop();
            }else if(operations[i].equals("D") && st.size()>0){
                st.push(2*st.get(st.size()-1));
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int sum=0;
        for(int i=0;i<st.size();i++){
            sum+=st.get(i);
        }

        return sum;
    }
}