class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> fin = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(fin, new ArrayList<>(), candidates, target, 0);
        return fin;
    }

    public void backtracking(List<List<Integer>> fin, List<Integer> inter, int[] candidates, int target, int start){
        if(target < 0){
            return;
        }
        else if(target == 0){
            fin.add(new ArrayList(inter));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            inter.add(candidates[i]);
            backtracking(fin, inter, candidates, target - candidates[i], i+1);
            inter.remove(inter.size() - 1);
        }
    }
}