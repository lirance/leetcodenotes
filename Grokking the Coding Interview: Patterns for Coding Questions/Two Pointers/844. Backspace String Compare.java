class Solution {
    public boolean backspaceCompare(String S, String T) {
        int inds=S.length()-1, indt=T.length()-1;
        
        while(inds>=0||indt>=0){
            
            inds = findNextValid(S,inds);
            indt = findNextValid(T,indt);
            
            if(inds<0&&indt<0){
                return true;
            }
            if(inds<0||indt<0){
                return false;
            }
            if(S.charAt(inds)!=T.charAt(indt)){
                return false;
            }
            inds--;
            indt--;
    
        }
        
        if(inds>0||indt>0){
            return false;
        }
                
        return true;
        
    }
  
    public int findNextValid(String s, int len){
        int count = 0;
        while(len>=0){
            if(s.charAt(len)=='#'){
                count++;
            }else if(count>0){
                count--;
            }else{
                break;
            }
          
            len--;
            
        }
        return len;
    
    }
    
}
