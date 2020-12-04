class Solution {
    
    
    public boolean checkInclusion(String s1, String s2) {
        int left=0, match=0;

        Map<Character,Integer> map = new HashMap<>();
        for(Character c:s1.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int right = 0; right<s2.length(); right++){
            char c = s2.charAt(right);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    match++;
                }
            }
           
            if(right>s1.length()-1){
                char c1 =s2.charAt(left++);
                if(map.containsKey(c1)){
                    if(map.get(c1)==0){
                        match--;
                    }
                    
                    map.put(c1,map.get(c1)+1);
                }
            }
            
            if(match==map.size()){
                return true;
            }          
            
        }
        
        return false;

    }
}
