public class rotateLeft3{
  public int[] rotateLeft3(int[] nums) {
    int[] output = new int[3];
    output[0] = nums[1];
    output[1] = nums[2];
    output[2] = nums[0];
    return output;
  }
}
