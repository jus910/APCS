public class groupSum{
  public boolean groupSum(int start, int[] nums, int target) {
    int sum;
    if(start==nums.length){
      return target==0;
    } else
    if (groupSum(start + 1, nums, target - nums[start])){
      return true;
    } else
    if (groupSum(start + 1, nums, target)){
      return true;
    } else {
      return false;
    }
  }
}
