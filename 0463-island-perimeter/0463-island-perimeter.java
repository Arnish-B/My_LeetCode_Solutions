class Solution {
    int peri = 0;
    public int islandPerimeter(int[][] grid) {       
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j);
                }
            }
        }
        return peri;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;
        }
        System.out.println("Before " + peri + " " + i + " " + j);
        peri += cellPeri(grid, i, j);
        System.out.println("After " + peri + " " + i + " " + j);
    }
    public int cellPeri(int[][] grid, int i, int j){
        int p = 0;
        if(i == 0 || grid[i-1][j] == 0){
            p += 1;
        }
        if(j == 0 || grid[i][j-1] == 0){
            p += 1;
        }
        if(i == grid.length -1 || grid[i+1][j] == 0){
            p += 1;
        }
        if(j == grid[0].length -1 || grid[i][j+1] == 0){
            p += 1;
        }
        return p;
    }
}