class Solution {
  public int[] shuffle(int[] nums, int n) {
  int[] myNewArray = new int[nums.length];
  int j = n;
  int k =0;
  for(int i =0;i<n;i++){
    myNewArray[k]=nums[i];
    myNewArray[k+1]=nums[j];
    j++;
    k+=2;
  }
      return myNewArray;
  }
}