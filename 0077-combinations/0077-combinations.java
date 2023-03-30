class Solution {
    public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		return combs;
	}
	public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n;i++) {
			comb.add(i);
            // System.out.println("COMBS IN LOOP BEFORE RECURSION" + combs);
			combine(combs, comb, i+1, n, k-1);
            // System.out.println("COMBS IN LOOP AFTER RECURSION" + combs);
			comb.remove(comb.size()-1);
		}
	}
}