public class sum2{
  public int sum2(int[] nums) {
    if (nums.length == 0){
      return 0;
    } else if (nums.length == 1){
      return nums[0];
    } else {
      return nums[0] + nums[1];
    }
  }
}
