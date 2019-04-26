class Solution {
    // use two pointers, the time complexity is O(n)
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
    

// bruce force O(n^2)
    public int[] twoSum_(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i=0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(sum == target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }else if(sum > target){
                    break;
                }
            }
        }
        
         return result;
    }
}
