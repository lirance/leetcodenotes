class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2)->(o1[0]-o2[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
      //  List<Integer> roomsEnd = new ArrayList<>();
        
        
        for(int[] interval:intervals){
            if(!pq.isEmpty()&&pq.peek()<=interval[0]){
                int end = pq.poll();
                pq.offer(Math.max(end, interval[1]));
                continue;    
            }
            pq.offer(interval[1]); 
        }
        return pq.size();      
    }
}
