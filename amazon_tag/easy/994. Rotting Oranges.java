class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Integer> queue = new ArrayDeque();
        Map<Integer,Integer> depth = new HashMap<>();
        if(grid == null){
            return 0;
        }
        
        int time = 0;
        int line = grid[0].length;
        
        // find all of the rotten oranges.
        for(int i=0;i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    int key = i*line+j;
                    queue.offer(key);
                    depth.put(key,0);
                }
            }
        }
        
        
        while(queue!=null&&!queue.isEmpty()){
            int position = queue.poll();
            int x = position/line;
            int y = position%line;
            int d = depth.get(position);
            // System.out.println(position);
            // left fresh
            if(x-1>=0&&grid[x-1][y]==1){
                grid[x-1][y]=2;
                int p1 = (x-1)*line+y;
                queue.offer(p1);
                depth.put(p1,d+1);
                time = Math.max(time,d+1);
            }
            if(x+1<grid.length&&grid[x+1][y]==1){
                grid[x+1][y]=2;
                int p2 = (x+1)*line+y;
                queue.offer(p2);
                depth.put(p2,d+1);
                time = Math.max(time,d+1);
            }
            if(y-1>=0&&grid[x][y-1]==1){
                grid[x][y-1]=2;
                int p3 = x*line+y-1;
                queue.offer(p3);
                depth.put(p3,d+1);
                time = Math.max(time,d+1);
            }
            if(y+1<grid[0].length&&grid[x][y+1]==1){
                grid[x][y+1]=2;
                int p4 = x*line+y+1;
                queue.offer(p4);
                depth.put(p4,d+1);
                time = Math.max(time,d+1);
            }
        }
        
          for(int i=0;i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
    
}
