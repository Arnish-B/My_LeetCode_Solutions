class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k%nums.length;
        }
        
        List<Integer> li = new ArrayList<>();
        for(int i =nums.length-k;i<nums.length;i++){
            li.add(nums[i]);
        }
        for(int i = nums.length-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i = 0;i < k;i++){
            nums[i] = li.get(i);
        }
    }
}