class Solution {
    public String reverseWords(String s) {
        String[] splt = s.split(" ");
    
        StringBuilder sb = new StringBuilder();
        for(int i=splt.length-1 ; i>=0; i--){
            if(!splt[i].equals("")){
                sb.append(splt[i]);   
                sb.append(" ");
            }
        }
        if(!(sb.toString()).equals("")){
            sb.deleteCharAt(sb.length()-1);        
        }
        return sb.toString();
    }
}
