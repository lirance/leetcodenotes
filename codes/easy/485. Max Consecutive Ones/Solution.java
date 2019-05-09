class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for(int n:nums){
            if(n==1){
                temp++;
            }else{
                temp = 0;
            }
             max = Math.max(temp,max);
        }
        return max;
    }
}
