class Solution {
    public int fib(int n) {
        int[] fin = new int[n+1];
        for(int i =0;i<=n;i++){
            if(i == 0){
                fin[i] = 0;
            }
            else if(i == 1){
                fin[i] = 1;
            }
            else{
                fin[i] = fin[i-1] + fin[i-2];
            }
        }
        return fin[n];
    }
}