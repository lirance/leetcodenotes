class Solution {
// time complexity = 0(n*logN)
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int maxSum = -1;
        int i=0, j=A.length-1;
        
        while(i<j){
            int sum = A[i]+A[j];
            if(sum>=K){
                j--;
            }else{
                maxSum = Math.max(sum,maxSum);
                i++;
            }
        }
        
        return maxSum;          
    }
    
    
    // time complexity = O(n*n)
    public int twoSumLessThanK1(int[] A, int K) {
        int maxsum = -1;
        
        for(int i=0; i < A.length; i++){
            for(int j=i+1; j< A.length; j++){
                int sum = A[i]+A[j];
                if(sum<K && sum>maxsum){
                    maxsum = sum;
                }
            }
        }
        
        return maxsum;
    }
}
