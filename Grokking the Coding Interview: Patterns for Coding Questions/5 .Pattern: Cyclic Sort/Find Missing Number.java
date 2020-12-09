/*
*We are given an array containing ‘n’ distinct numbers taken from the range 0 to ‘n’. Since the array has only ‘n’ numbers out of the total ‘n+1’ numbers, find the missing number.
*
*Example 1:
*
*Input: [4, 0, 3, 1]
*Output: 2
*/

class MissingNumber {

  public static int findMissingNumber(int[] nums) {
    // TODO: Write your code here
    for (int i=0; i<nums.length; i++) {
      while(nums[i]<nums.length && nums[i]!=i){
        swap(nums, i, nums[i]);
      }
    }


    for(int i=0; i<nums.length; i++) {
      if(i!=nums[i]){
        return i;
      }
    }
    return -1;
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
