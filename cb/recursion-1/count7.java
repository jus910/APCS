public class count7{
  public int count7(int n) {
    if(n<10){
      if (n==7){
        return 1;
      } else {
        return 0;
      }
    } else {
      if (n%10==7){
        return 1+count7(n/10);
      } else{
        return 0+count7(n/10);
      }
    }
  }
}
