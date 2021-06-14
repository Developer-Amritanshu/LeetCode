class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && j!=i){
                    newArr[i]+=1;
                } 
            }
        }
        return newArr;
    }
}