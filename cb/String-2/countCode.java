public class countCode{
  public int countCode(String str) {
  int code=0;
  for(int i=0;i<str.length()-3;i=i+1){
    if ((str.substring(i,i+2)).equals("co")){
      if ((str.substring(i+3,i+4)).equals("e")){
        code++;
      }
    }
  }
  return code;
}
}
