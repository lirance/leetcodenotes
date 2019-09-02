class Solution {
    public int findMin(int[] nums) {
        int pivot=0;
        int n = nums.length;
        if(n==0){
            return -1;
        }
        if(n==1){
            return nums[0];
        }
        int left = 0;
        int right = n-1;
        
        if(nums[right]>nums[0]){
            return nums[0];
        }
        
        while(left<=right){
            int mid = left+(right-left)/2;
            
            // mid is the pivot;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            
            if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            
            if(nums[mid]>nums[0]){
                left = mid+1;
            }else{
                right = mid-1;
            }
            
        }
        return -1;
        
    }
}
