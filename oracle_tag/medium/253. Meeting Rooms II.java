class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        
        //sort the array by the start time
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[]a, int[]b){
                return a[0]-b[0];
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<intervals.length; i++) {
            if(pq.isEmpty()||pq.peek()>intervals[i][0]){
                pq.add(intervals[i][1]);
            }else{
                pq.poll();
                pq.add(intervals[i][1]);
            }
        }
        return pq.size();
        
    }
}
