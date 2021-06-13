class Solution {
  public int maximumWealth(int[][] accounts) {
  int[] allSum = new int[accounts.length];
  int i =0;
  int max =  0;
  for(int[]acc : accounts){
    for(int p:acc){
      allSum[i] += p;
    }
    if(allSum[i]>max){
      max = allSum[i];
    }
    i++;
  }

  return max;
  }
}