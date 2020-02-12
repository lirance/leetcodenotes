class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<pid.size();i++){
            List<Integer> l;
            if(!map.containsKey(ppid.get(i))){
                l = new ArrayList<>();
            }else{
                l = map.get(ppid.get(i));
            }
            l.add(pid.get(i));
            map.put(ppid.get(i),l);
        }
        
        Stack<Integer> s = new Stack<>();
        s.push(kill);
        
        while(!s.isEmpty()){
            int k = s.pop();
            result.add(k);
            List<Integer> l = map.get(k);
            if(l!=null&&!l.isEmpty()){
                for(int i:l){
                    s.push(i);
                }
            }
        }
        
        return result;
        
        
    }
}
