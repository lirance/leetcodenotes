class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int idx = 0;
        while (idx < nums.length) {
            if(nums[idx]!=nums[nums[idx]-1]){
                swap(nums,idx,nums[idx]-1);
            }else{
                idx++;
            }
        }
        
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=i+1){
                l.add(i+1);
            }
        }
        
        return l;
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
