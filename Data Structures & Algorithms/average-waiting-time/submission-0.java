class Solution {
    public double averageWaitingTime(int[][] customers) {
        int finish=0;
        double time=0;
        for(int i=0;i<customers.length;i++){
            finish=Math.max(finish,customers[i][0]);
            finish+=customers[i][1];

            time+=(finish-customers[i][0]);
        }

        return time/customers.length;
    }
}