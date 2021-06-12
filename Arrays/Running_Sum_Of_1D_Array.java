class Running_Sum_Of_1D_Array{
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
  }
  for(int p:nums){
    System.out.print(p+" ");
  }
  }
}