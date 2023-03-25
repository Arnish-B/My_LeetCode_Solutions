class Solution {

    public long dfs(int pos, boolean[] visited, int[] count, List<Integer>[] graph){
        if(visited[pos]) {
            return count[0];
        }
        visited[pos] = true;
        count[0]++;
        for(int i: graph[pos]){
            dfs(i, visited, count, graph);
        }
        return count[0];
    }
    public long countPairs(int n, int[][] edges) {
        List<Integer>[] graph = new List[n];
        long totalconnections = (Long.valueOf(n)*(n-1))/2;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        for(int i =0;i<n;i++){
            if(!visited[i]){
                long cnt = dfs(i, visited, new int[1], graph);
                totalconnections -= (Long.valueOf(cnt) * (cnt-1))/2;
            }            
        }

        return totalconnections;
    }
}