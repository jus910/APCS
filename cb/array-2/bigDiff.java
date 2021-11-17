public class bigDiff{
  public int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for (int x: nums){
      min = Math.min(min,x);
      max = Math.max(max,x);
    }
    return max-min;
  }
}
