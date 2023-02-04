class Solution {
    char count = '2';
    public int numIslands(char[][] grid) {
        int len = grid.length;
        int wid = grid[0].length;
        for(int i =0;i<len;i++){
            for(int j=0;j<wid;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    ++count;
                }
            }
        }
        for(int i =0;i<len;i++){
            for(int j=0;j<wid;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        return (count - 50);
    }

    public void dfs(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1'){
            return;
        }
        else{
            grid[i][j] = count;
            dfs(grid,i-1,j);
            dfs(grid,i,j-1);
            dfs(grid,i+1,j);
            dfs(grid,i,j+1);
        }
    }
}