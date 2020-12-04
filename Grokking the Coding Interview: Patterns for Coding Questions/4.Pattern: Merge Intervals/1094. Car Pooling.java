class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // sort the array by start time
        Arrays.sort(trips, (o1,o2)->(o1[1]-o2[1]));
    
        PriorityQueue<int[]>pq = new PriorityQueue<>((o1,o2)->(o1[2]-o2[2]));
        
        int current = 0;
        int max = 0;
        for(int i=0; i<trips.length; i++){
            // remove the passed trip from the pq
            while(!pq.isEmpty() && pq.peek()[2]<=trips[i][1]){
                int[] temp = pq.poll();
                current-=temp[0];       
            }
            
            pq.offer(trips[i]);
            current+=trips[i][0];
            max = Math.max(max, current);
            if(max>capacity){
                return false;
            }
                         
        }
        
        return true;
    }
}
