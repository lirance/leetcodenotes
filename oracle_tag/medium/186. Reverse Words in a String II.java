class Solution {
    public void reverseWords(char[] s) {
        reverse(0,s.length-1,s);
        
        int start=0,end=0;
        while(end<s.length){
            if(end==s.length-1){
                reverse(start,end,s);
            }
            
            if(s[end]==' '){
                reverse(start,end-1,s);
                start = end+1;                
            }
            end++;
        }
        
    }
    
    private void reverse(int start, int end, char[]s){
        while(start<end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
