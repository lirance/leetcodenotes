class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        int count = 0;
        for(char key: map.keySet()){
            if(map.get(key)%2!=0){
                count++;
            }
        }
        return count<=1;
    }
}
