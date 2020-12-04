class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals,(o1,o2)->(o1[0]-o2[0]));
        
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<intervals[i-1][1]){
                return false;
            }
            
        
        }
        
        return true;
    }
}
