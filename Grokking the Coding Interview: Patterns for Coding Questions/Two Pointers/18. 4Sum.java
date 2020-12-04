class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    Arrays.sort(arr);
    // TODO: Write your code here
    for(int i=0; i<arr.length-3;i++){
        if(i>0&&arr[i]==arr[i-1]){continue;}
      for(int j=i+1; j<arr.length-2; j++){
          if(j>i+1&&arr[j]==arr[j-1]){continue;}
        int tempt = target- arr[i] - arr[j];
        int left = j+1, right = arr.length-1;
        while(left<right){
          int temps = arr[left]+arr[right];
          if(temps==tempt){
            List<Integer> l = new ArrayList<>();
            l.add(arr[i]);
            l.add(arr[j]);
            l.add(arr[left]);
            l.add(arr[right]);
            quadruplets.add(l);
            left++;
            right--;
              while(left<right&&arr[left]==arr[left-1]){
                  left++;
              }
              while(left<right&&arr[right]==arr[right+1]){
                  right--;
              }
          }else if (temps<tempt){
            left++;
          }else{
            right--;
          }
        }

      }
    }
        return quadruplets;
    }
}
