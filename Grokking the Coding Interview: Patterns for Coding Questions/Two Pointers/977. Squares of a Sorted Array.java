class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0, right = nums.length-1;
        int idx = nums.length-1;
        int[] res = new int[nums.length];
        
        while(left<=right){
            int ls = nums[left]*nums[left];
            int rs = nums[right]*nums[right];
            
            if(ls>=rs){
                res[idx]=ls;
                left++;
            }else{
                res[idx]=rs;
                right--;
            }
            idx--;
        }
        
        return res;
        
    }
}
