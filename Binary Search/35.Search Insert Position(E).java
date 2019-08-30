class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    
    private int binarySearch(int[] nums, int left, int right, int target){
        int mid = (left+right)/2;
        int result = -1;
        if(left>right){
            return left;
        }
        
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return binarySearch(nums,left,mid-1,target);
        }else{
            return binarySearch(nums,mid+1,right,target);
        }
    }
}
