class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> existing = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(existing.containsKey(nums[i])){
                return new int[]{ existing.get(nums[i]), i};
            } else
                existing.put(target - nums[i], i);
        }
        
        return null;
    }
}