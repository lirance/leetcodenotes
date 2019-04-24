class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
        public int compare(int[] i1, int[] i2) {
            return i1[0] - i2[0];
        }        
    });
       
        for(int j = 1 ; j<intervals.length; j++){
            if(intervals[j][0]<intervals[j-1][1]){
                return false;
            }
        }
        return true;
    }
}
