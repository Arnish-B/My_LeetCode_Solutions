class Solution {
    // public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //     List<List<Integer>> fin = new ArrayList<>();
    //     Arrays.sort(candidates);
    //     backtracking(fin, new ArrayList<>(), candidates, target, 0);
    //     return fin;
    // }

    // public void backtracking(List<List<Integer>> fin, List<Integer> inter, int[] candidates, int target, int sum){
    //     if(sum == target){
    //         Collections.sort(inter);
    //         if(!fin.contains(inter)){
    //             fin.add(new ArrayList(inter));
    //         }
    //         // fin.add(new ArrayList(inter));
    //         return;
    //     }

    //     for(int i=0;i<candidates.length;i++){
    //         sum+=candidates[i];
    //         if(sum > target){
    //             sum -= candidates[i];
    //             continue;
    //         }
    //         inter.add(candidates[i]);
    //         backtracking(fin, inter, candidates, target, sum);
    //         int temp = inter.get(inter.size()-1);
    //         inter.remove(inter.size()-1);
    //         sum -= temp;
    //     }
    // }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{ 
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}