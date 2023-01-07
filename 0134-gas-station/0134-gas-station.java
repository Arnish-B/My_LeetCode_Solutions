class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        for(int i = 0;i<gas.length;i++){
            sumGas+=gas[i];
        }
        for(int i = 0;i<cost.length;i++){
            sumCost+=cost[i];
        }
        if(sumGas<sumCost){
            return -1;
        }
        int pos=-1;
        int total = 0;
        int diff[] = new int[gas.length];
        for(int i = 0;i < gas.length; i++){
            diff[i] = gas[i] - cost[i];
        }
        for(int i = 0;i<gas.length;i++){
            total += diff[i];
            if(total < 0){
                total = 0;
                pos = -1;
            }
            else{
                if(pos == -1){
                    pos = i;
                }
            }
        }
        if(total < 0){
            return -1;
        }
        return pos;
    }
}