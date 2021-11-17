public class maxEnd3{
  public int[] maxEnd3(int[] nums) {
    int[] output = new int[3];
    if (nums[0]>nums[2]){
      output[0]=nums[0];
      output[1]=nums[0];
      output[2]=nums[0];
    } else{
      output[0]=nums[2];
      output[1]=nums[2];
      output[2]=nums[2];
    }
    return output;
  }
}
