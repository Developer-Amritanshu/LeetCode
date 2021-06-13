class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
  List<Boolean> myNewArray = new ArrayList<Boolean>();
  int max= candies[0];
      
  for(int m:candies){
    if(m>max){
      max = m;
    }
  }
      
  int i =0;
  for(int e:candies){
    if(e+extraCandies >= max){
      myNewArray.add(true);
      i++;
    }else{
      myNewArray.add(false);
      i++;
    }
  }
      return myNewArray;
  }
}