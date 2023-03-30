class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> fin = new ArrayList<>();
        // Arrays.sort(nums);
        solveItForMe(fin, new ArrayList<>(), nums);
        return fin;
    }

    private void solveItForMe(List<List<Integer>> fin, List<Integer> inter, int[] nums){
        
        if(inter.size() == nums.length){
        fin.add(new ArrayList(inter));
        }
        else{
        for(int i= 0;i<nums.length;i++){
            if(inter.contains(nums[i])) continue;
            inter.add(nums[i]);
            solveItForMe(fin, inter, nums);
            inter.remove(inter.size()-1);
        }
        }        
    }
}