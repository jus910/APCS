public class lucky13{
  public boolean lucky13(int[] nums) {
    for(int x : nums) {
      if (x==1 || x==3) {
        return false;
      }
    }
    return true;
  }
}
