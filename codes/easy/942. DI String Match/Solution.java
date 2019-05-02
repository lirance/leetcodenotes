class Solution {
    public int[] diStringMatch(String S) {
        int[] A = new int[S.length()+1];
        
        for(int i = 0; i< A.length ;i++){
            A[i]=i;
        }
        
        int left = 0;
        int right = A.length-1;
        
        int[] result = new int[S.length()+1];
        int cur = 0;
        for(char c : S.toCharArray()){
            if(c=='I'){
                result[cur]=A[left];
                left++;
            }else{
                result[cur]=A[right];
                right--;
            }
            cur++;
        }
        result[cur]=A[left];
        return result;
        
    }
}
