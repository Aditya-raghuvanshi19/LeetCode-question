class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int n: gas){
            totalgas+=n;
        }
        for(int n: cost){
            totalcost+=n;
        }
        if(totalgas<totalcost)
        return -1; 

        //now if atlest one stating point exist than

        int start=0;
        int currgas=0;
        for(int i=0;i<gas.length;i++){//no need to check backward station  
            currgas += gas[i]-cost[i];
            if(currgas<0)
            {
                start=i+1;
                currgas=0;

            }
        }
        return start;


    }
}