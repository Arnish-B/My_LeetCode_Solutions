class Solution {
    
    static class Position {
        int x;
        int y;
        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
	
    public int orangesRotting(int[][] grid) {
        Queue<Position> q = new LinkedList<>();
        int total = 0, rotten = 0, time = 0;
		
		
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 || grid[i][j] == 2) total++;
                if (grid[i][j] == 2) q.offer(new Position(i, j));
            }
        }
		
		
        if (total == 0) return 0;
		
        while (! q.isEmpty() && rotten < total) {
			
            int size = q.size();
			
			
            rotten += size;
            if (rotten == total) return time;
			
			
            time++;
			
			
            for (int i = 0; i < size; i++) {
                Position p = q.peek();
				
				
                if (p.x + 1 < grid.length && grid[p.x + 1][p.y] == 1) {
                    grid[p.x + 1][p.y] = 2;
                    q.offer(new Position(p.x + 1, p.y));
                }
                if (p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
                    grid[p.x - 1][p.y] = 2;
                    q.offer(new Position(p.x - 1, p.y));
                }
                if (p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 1) {
                    grid[p.x][p.y + 1] = 2;
                    q.offer(new Position(p.x, p.y + 1));
                }
                if (p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1) {
                    grid[p.x][p.y - 1] = 2;
                    q.offer(new Position(p.x, p.y - 1));
                }
                q.poll();
            }
        }
        return -1;
    }
}