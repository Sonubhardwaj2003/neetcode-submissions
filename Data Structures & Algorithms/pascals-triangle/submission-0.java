class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        
        if(numRows==1){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            res.add(list);
            return res;
        }

        List<Integer> li=new ArrayList<>();
        li.add(1);
        res.add(li);
        for(int i=0;i<numRows-1;i++){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=0;j<i;j++){
                list.add(res.get(i).get(j)+res.get(i).get(j+1));
            }
            list.add(1);
            
            res.add(list);
        }

        return res;
    }
}