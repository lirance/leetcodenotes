class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int res = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length-2; i++){
            int tempt = target-nums[i];
            
            int left = i+1, right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right];
                if(Math.abs(sum-tempt)<min){
                    
                    System.out.println(min);
                    min=Math.abs(sum-tempt);
                 
                    res = sum+nums[i];
                }
                if(sum==tempt){
                    return target;
                }
                if(sum>tempt){
                    right--;
                }else{left++;}
                
            }
            
            
            
        }
        
        return res;
        
    }
}
