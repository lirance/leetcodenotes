class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            if(citations[0]>=1){
                return 1;
            }else{
                return 0;
            }
        }
        
        int left = 0, right = n-1;
        
        while(left<=right){
    
            int mid = (right + left )/2;
            
            if (citations[mid] == n-mid){
               // System.out.println(mid);
                return n-mid;
            }
            
            if(citations[mid] < n-mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return n-left;
    }
}
