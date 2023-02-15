class Solution {
    public int climbStairs(int n) {
        int fin[] =new int[n+1];
        for(int i =0;i<n+1;i++){
            if(i == 0){
                fin[i] = 0;
            }
            else if(i == 1){
                fin[i] = 1;
            }
            else if(i == 2){
                fin[i] = 2;
            }
            else if(i == 3){
                fin[i] = 3;
            }
            else{
                fin[i] = fin[i-1] + fin[i-2];
            }
        }
        return fin[n];
    }
}