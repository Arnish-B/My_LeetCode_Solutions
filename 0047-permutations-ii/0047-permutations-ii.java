class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> fin = new ArrayList<>();
        Arrays.sort(nums);
        boolean visited[] = new boolean[nums.length];
        backtracking(fin, new ArrayList<>(), nums, visited);
        return fin;
    }

    public void backtracking(List<List<Integer>> fin, List<Integer> inter, int[] nums, boolean[] visited){
        if(inter.size() == nums.length){
            fin.add(new ArrayList(inter));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i] == true || i>0 && nums[i] == nums[i-1] && visited[i-1]==false){
                continue;
            }
            visited[i] = true;
            inter.add(nums[i]);
            backtracking(fin, inter, nums, visited);
            visited[i] = false;
            inter.remove(inter.size()-1);
        }
    }

}