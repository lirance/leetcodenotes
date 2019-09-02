class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length ==0) return false;
        
        return binarySearch(matrix, 0, matrix[0].length*matrix.length-1, target);
    }
    
    private boolean binarySearch(int[][] matrix, int left, int right, int target){
        int m = matrix[0].length;
        int n = matrix.length;
        if(left>right){
            return false;
        }
        int mid = (left+right)/2;
        int midX = mid%m;
        int midY = mid/m;
        
        if(matrix[midY][midX]==target){
            return true;
        }else if(matrix[midY][midX]>target){
            return binarySearch(matrix, left, mid-1, target);
        }else{
            return binarySearch(matrix, mid+1, right, target);
        }
    }
}
