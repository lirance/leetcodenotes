class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        int n = nums.length/2;
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else if(i<=n){
                map.put(nums[i],1);
            }
        }
        
        for(int mapKey:map.keySet()){
            if(map.get(mapKey)>(nums.length/2)){
                return mapKey;
            }
        }
        return -1;
        
    }
    
  public int majorityElementSort (int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];      
    }
    
}
