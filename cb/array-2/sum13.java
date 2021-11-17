public class sum13{
  public int sum13(int[] nums) {
    int sum = 0;
    for(int i=0; i<nums.length; i++){
      sum+=nums[i];
      if (nums[i] == 13) {
        sum=sum-13;
        i++;
      }
    }
    return sum;
  }
}
