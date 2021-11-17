public class more14{
  public boolean more14(int[] nums) {
    int onesCount = 0;
    int foursCount = 0;
    for (int x: nums){
      if (x==1){
        onesCount++;
      }
      if (x==4){
        foursCount++;
      }
    }
    return onesCount > foursCount;
  }
}
