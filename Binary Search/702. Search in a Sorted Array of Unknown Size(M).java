class Solution {
    public int search(ArrayReader reader, int target) {
        
        if(reader.get(0)==target){
            return 0;
        }
        int left = 0, right = 1;
        
        while(reader.get(right)<target){
            left=right;
            right = right*2;
        }
        
        int mid = (left+right)/2;
        
        while(left<=right){
            mid = (left+right)/2;
            if(target==reader.get(mid)){
                return mid;
            }
            if(target<reader.get(mid)){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
