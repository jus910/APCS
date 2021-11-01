public class countHi{
  public int countHi(String str) {
  int hi=0;
  for(int i=0;i<str.length()-1;i=i+1){
    if ((str.substring(i,i+2)).equals("hi")){
      hi++;
    }
  }
  return hi;
}

  public static void main(String[] args){
    countHi james = new countHi();
    System.out.println(james.countHi("hihi"));
  }
}
