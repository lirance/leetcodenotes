class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        if(n==0){
            return -1;
        }
        int peak = getPeak(nums,0,n-1);
        
        int left = getIndex(nums,0,peak,target);
        if(left!=-1){
            return left;
        }else{
            return getIndex(nums,peak+1,n-1,target);
        }
    }
    
    private int getPeak(int[] nums, int left, int right){
         if (nums[left] < nums[right] || left>=right){
             return 0;
         }
        int mid = (right+left)/2;
        
        if(nums[mid]>nums[mid+1]){
            return mid;
        }else if(nums[left]>nums[mid]){
            right = mid;
        }else{
            left = mid;
        }
        return getPeak(nums,left,right);
    }
    
    private int getIndex(int[] nums, int left, int right, int target){
        
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            right = mid-1;
        }else{
            left = mid+1;
        }
        return getIndex(nums,left,right,target);
    }
}
