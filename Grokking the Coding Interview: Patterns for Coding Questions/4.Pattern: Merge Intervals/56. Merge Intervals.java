class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2)->(o1[0]-o2[0]));
        
        List<int []> res = new ArrayList<>();
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            // overlapping
            if(intervals[i][0]<=end){
                end = Math.max(end,intervals[i][1]);
            }else{
                // not overlapping, add last pair into list, reset start & end
                res.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        
        
        // add the last pair
         res.add(new int[]{start,end});
        
        return res.toArray(new int[res.size()][2]);
    }
}
