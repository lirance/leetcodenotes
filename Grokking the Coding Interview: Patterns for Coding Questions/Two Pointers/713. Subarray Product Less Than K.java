class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int target) {
        int count = 0;
        int left = 0;
        
        int product = 1;
        if(target<=1) return 0;
        
        for(int right = 0; right<arr.length; right++){
            product = product * arr[right];
            while(product>=target){
                product/=arr[left++];
            }
            count += right-left+1;
            
        }
        
        return count;
      
    }
}
