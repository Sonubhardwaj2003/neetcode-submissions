class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int gry=0;int cust=0;
        int maxGry=0;
        for(int i=0;i<minutes-1;i++){
            if(grumpy[i]==1){
                gry+=customers[i];                
            }else{
                cust+=customers[i];
            }
        }

        for(int i=minutes-1;i<customers.length;i++){
            if(grumpy[i]==1){
                gry+=customers[i];                
            }else{
                cust+=customers[i];
            }

            maxGry=Math.max(maxGry,gry);

            if(grumpy[i-minutes+1]==1){
                gry-=customers[i-minutes+1];
            }
        }

        
        return cust+maxGry;
    }
}