// class Solution {
    
//     static class Position {
//         int x;
//         int y;
//         Position(int x, int y) {
//             this.x = x;
//             this.y = y;
//         }
//     }
	
//     public int orangesRotting(int[][] grid) {
//         Queue<Position> q = new LinkedList<>();
//         int total = 0, rotten = 0, time = 0;
		
		
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {
//                 if (grid[i][j] == 1 || grid[i][j] == 2) total++;
//                 if (grid[i][j] == 2) q.offer(new Position(i, j));
//             }
//         }
		
		
//         if (total == 0) return 0;
		
//         while (! q.isEmpty() && rotten < total) {
			
//             int size = q.size();
			
			
//             rotten += size;
//             if (rotten == total) return time;
			
			
//             time++;
			
			
//             for (int i = 0; i < size; i++) {
//                 Position p = q.peek();
				
				
//                 if (p.x + 1 < grid.length && grid[p.x + 1][p.y] == 1) {
//                     grid[p.x + 1][p.y] = 2;
//                     q.offer(new Position(p.x + 1, p.y));
//                 }
//                 if (p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
//                     grid[p.x - 1][p.y] = 2;
//                     q.offer(new Position(p.x - 1, p.y));
//                 }
//                 if (p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 1) {
//                     grid[p.x][p.y + 1] = 2;
//                     q.offer(new Position(p.x, p.y + 1));
//                 }
//                 if (p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1) {
//                     grid[p.x][p.y - 1] = 2;
//                     q.offer(new Position(p.x, p.y - 1));
//                 }
//                 q.poll();
//             }
//         }
//         return -1;
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Solution {
    
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 2) rotAdjacent(grid, i, j, 2);
            }
        }
        
        int minutes = 2;
        for(int[] row : grid) {
            for(int cell : row) {
                if(cell == 1) return -1;
                minutes = Math.max(minutes, cell);
            }
        }
        
        return minutes - 2;
    }
    
    private void rotAdjacent(int[][] grid, int i, int j, int minutes) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || (1 < grid[i][j] && grid[i][j] < minutes)) return;
        else {
            grid[i][j] = minutes;
            rotAdjacent(grid, i - 1, j, minutes + 1);
            rotAdjacent(grid, i + 1, j, minutes + 1);
            rotAdjacent(grid, i, j - 1, minutes + 1);
            rotAdjacent(grid, i, j + 1, minutes + 1);
        }
    }
}