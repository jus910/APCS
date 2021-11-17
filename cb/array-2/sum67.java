public class sum67{
  public int sum67(int[] nums) {
    int sum = 0;
    boolean state = false;
    for(int i=0; i<nums.length; i++){
      sum+=nums[i];
      if (nums[i]==6) {
        state = true;
      } 
      if (state){
        if (nums[i]==7){
          state = false;
          sum-=7;
        } else {
          sum -= nums[i];
        }
      }
    }
    return sum;
  }
}
