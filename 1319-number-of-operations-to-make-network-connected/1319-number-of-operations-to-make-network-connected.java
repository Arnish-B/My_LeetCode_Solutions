class Solution {
    public int dfs(int pos, List<Integer>[] graph, boolean[] visited){
        if(visited[pos] == true){
            return 0;
        }
        visited[pos] = true;
        for(int i: graph[pos]){
            dfs(i, graph, visited);
        }
        return 1;
    }
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) 
        {
            return -1;
        }
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] c : connections) {
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }
        int components = 0;
        boolean visited[] = new boolean[n];
        for(int i =0;i<n;i++){
            components += dfs(i, graph, visited);
        }
        return components - 1;
    }
}