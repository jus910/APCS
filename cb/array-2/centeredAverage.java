public class centeredAverage{
  public int centeredAverage(int[] nums) {
    int sum = 0;
    int max = nums[0];
    int min = nums[0];
    for (int x: nums){
      min = Math.min(min,x);
      max = Math.max(max,x);
      sum+=x;
    }
    return (sum-min-max) / (nums.length - 2);
  }
}
