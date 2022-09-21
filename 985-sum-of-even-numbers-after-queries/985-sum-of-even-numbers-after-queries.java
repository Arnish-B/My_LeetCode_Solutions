class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int fin[] = new int[nums.length];
        int sum = 0;
        int n = nums.length;
        
        for(int i =0;i<n;i++){
            if(nums[i]%2==0){
                sum += nums[i];
            }
        }
        
        System.out.println(sum);
        
        
        
        for(int i=0;i<nums.length;i++){
            int temp = queries[i][1];
            int val = queries[i][0];
            nums[temp] = nums[temp] + val;
            if(nums[temp]%2==0){
                if((nums[temp] - val)%2==0){
                    sum += val;
                }
                else if((nums[temp] - val)%2!=0){
                    sum += nums[temp];
                }
            }
            else if((nums[temp]-val)%2==0 && nums[temp]%2!=0){
                sum = sum - (nums[temp] - val);
            }
            
            
            fin[i] = sum;
        }
        return fin;
    }
}