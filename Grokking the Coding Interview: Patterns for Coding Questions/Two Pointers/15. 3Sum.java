class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i =0; i<nums.length-2; i++){
            if(i>=1&&nums[i]==nums[i-1]){continue;}
            int left = i+1;
            int right = nums.length-1;
            int tar = -nums[i];
            
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum==tar){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    res.add(l);
                    
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    
                    while(right>left && nums[right]==nums[right+1]){
                        right--;
                    }
                    
                }else if(sum<tar){
                    left++;
                }else{
                    right--;
                }
                    
            }
            
        }
        
        return res;
    }
    
}
