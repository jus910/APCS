public class sum28{
  public boolean sum28(int[] nums) {
    int result=0;
    for (int i=0;i<nums.length;i++){
      if (nums[i]==2){
        result+=2;
      }
    }
    return result==8;
  }
}
