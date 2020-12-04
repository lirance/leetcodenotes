class Solution {
    public String minWindow(String str, String pattern) {
        int minLen = str.length()+1;
        String res = "";
        int left = 0, count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(Character c:pattern.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int right=0;right<str.length();right++){
          char rightChar = str.charAt(right);
          if(map.containsKey(rightChar)){
            if(map.get(rightChar)==1){
              count++;
            }
            map.put(rightChar,map.get(rightChar)-1);
          }
          // if left isn't in the map or the count of that char is more than 1
          while(left<=right&&(!map.containsKey(str.charAt(left))||map.get(str.charAt(left))<0)){
            char leftChar = str.charAt(left);
              if(map.containsKey(leftChar)){
                  if(map.get(leftChar)==0){
                    count--;
                    }
                map.put(leftChar,map.get(leftChar)+1);
                  
              }
            left++;
          }

          if(count==map.size()&&right-left+1<minLen){
              minLen = right-left+1;
             res = str.substring(left,right+1);
              
            }
        }
        return res;
    }
}
