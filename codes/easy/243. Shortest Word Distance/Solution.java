class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int l1=-1,l2=-1;
        
        int minDistance = words.length;
        for(int i=0; i<words.length; i++){
            if(words[i].equals(word1)){
                l1=i;
            }else if(words[i].equals(word2)){
                l2=i;
            }
            if(l1!=-1&&l2!=-1){
                minDistance = Math.min(minDistance,Math.abs(l1-l2));
            }
        }
   
        return minDistance;
    }
}
