class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        
        int count=0;
        for(int i=0; i<nums.length-2; i++){
            int left = i+1, right = nums.length-1;
            int tempT = target-nums[i];
            
            while(left<right){
                int tempSum = nums[left]+nums[right];
                if(tempSum<tempT){
                    count+=right-left;
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        return count;
        
    }
}
