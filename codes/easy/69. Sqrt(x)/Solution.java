class Solution {
    
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, hight = numbers.length-1;
        
        while(low<hight){
            int sum = numbers[low]+numbers[hight];
            
            if(sum == target){
                int []result = {low+1,hight+1};
                return result;
            }else if(sum < target){
                low++;
            }else{
                hight--;
            }
        }
        return new int[2];
    }
    
}
