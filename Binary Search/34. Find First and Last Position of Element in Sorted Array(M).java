class Solution {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        
        return binarySearch( nums, 0, length-1, target);
        
        
        
        
    }
    
    private int[] binarySearch(int[] nums,int left, int right, int target){
        int[]result = {-1,-1};

        if(right<left||target<nums[left]||target>nums[right]){
            return result;
        }
        
        
        int mid = (left+right)/2;

        if(nums[mid]==target){
            result[0]=mid;
            result[1]=mid;
            while(result[0]>left){
                if(nums[result[0]-1]<target){
                    break;
                }
                result[0]--;
            }
            while(result[1]<right){
                if(nums[result[1]+1]>target){
                    break;
                }
                result[1]++;
            }
            return result;     
        }
        
        if(nums[mid]<target){
            return binarySearch(nums, mid+1, right, target);
        }else{
            return binarySearch(nums,left,mid-1,target);
        }
    }
}
