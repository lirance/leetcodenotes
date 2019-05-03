class Solution {
    public int[] sortedSquares(int[] A) {
       
        if(A[0]>=0){
            return sqrt(A);
        }
        
        int[] res = new int[A.length];
        
        int i = 0;
        
        for(i=0;i<A.length;i++){
            if(A[i]>0){
                break;
            }
        }
        
        int j = i-1;
        
        int cur = 0;
        while(j>=0&&i<A.length){
            int temp;
            if(A[i]*A[i]>A[j]*A[j]){
                temp = j;
                j--;
            }else{
                temp = i;
                i++;
            }
            res[cur]=A[temp]*A[temp];
            cur++;
        }
        
        while(j>=0){
            res[cur]=A[j]*A[j];
            cur++;
            j--;
        }
        
        while(i<A.length){
            res[cur]=A[i]*A[i];
            cur++;
            i++;
        }
        return res;
    }
    
    private int[] sqrt(int[] A){
        
        int i=0;
        while(i<A.length){
            A[i]=A[i]*A[i];
            i++;
        }
        return A;
    }
}
