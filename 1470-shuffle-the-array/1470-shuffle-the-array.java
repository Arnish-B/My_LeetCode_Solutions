class Solution {
    public int[] shuffle(int[] nums, int n) {
        int fin[] = new int[2*n];
        int a = 0;
        int b = n;
        for(int i =0;i<2*n;i++){
            if(i%2 == 0){
                fin[i] = nums[a];
                ++a;
            }
            else{
                fin[i] = nums[b];
                ++b;
            }
        }
        return fin;
    }
}