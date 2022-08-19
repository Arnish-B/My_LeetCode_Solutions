class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
         
         
         
        Arrays.sort(nums);
         
         
        for(int i=0;i<nums.length;i++){
             while(i>0 &&  i < nums.length && nums[i]==nums[i-1]  ){
                 
                i++;
             
            }
             
             
            int l = i+1;
            int r = nums.length -1;
             
             
            while(l < r){
                 
                
                 
                int sum = nums[i]+nums[l]+nums[r];
                 
                 
                if(sum < 0){
                     
                    l++;
                }else if(sum > 0){
                     
                    r--;
                }else{
                    
                    
                        output.add(Arrays.asList(nums[i],nums[l],nums[r]));
                     
                    l++;
                    
                    while(nums[l]==nums[l-1] && l < r){
                        l++;
                    }
                     
                 
                }
                 
               
                 
            }
        }
         
        return output;
    }
}