class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle==null||needle.isEmpty()){
            return 0;
        }
        
        //int result = -1;
        int m = 0;
        int n = 0;
        char[] hc = haystack.toCharArray();
        char[] nc = needle.toCharArray();
        while(m<haystack.length()){
            
            if(hc[m]==nc[n]){
                if(n==needle.length()-1){
                    return m-n;
                }
                m++;
                n++;
            }else{
                m=m-n+1;
                n=0;
            }
        }
        return -1;
    }
}
