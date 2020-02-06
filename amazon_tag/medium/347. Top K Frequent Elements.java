class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(
            new Comparator<Map.Entry<Integer,Integer>>(){
                public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2){
                    return e2.getValue()-e1.getValue(); 
                }
            });
        
        queue.addAll(map.entrySet());
        
        while(k>0){
            result.add(queue.poll().getKey());
            k--;
        }
        
        return result;
    }
}347. Top K Frequent Elements
