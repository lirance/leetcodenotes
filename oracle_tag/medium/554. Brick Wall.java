class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        for(List<Integer> row:wall){
            for(int i=1; i<row.size()-1; i++){
                row.set(i,row.get(i-1)+row.get(i));
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(List<Integer> row:wall){
            for(int i=0; i<row.size()-1; i++){
                int key = row.get(i);
               if(map.containsKey(key)){
                   map.put(key,map.get(key)+1);
               }else{
                   map.put(key,1);
               }
            }
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            new Comparator<Map.Entry<Integer,Integer>>(){
                public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2){
                    return e2.getValue()-e1.getValue();
                }
            }); 
        
        pq.addAll(map.entrySet());
        
        if(pq.isEmpty()){
            return wall.size();
        }else{
            return wall.size()-pq.peek().getValue();
        }
        
    }
}
