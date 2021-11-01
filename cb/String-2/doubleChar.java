public class doubleChar{
  public String doubleChar(String str) {
    String out="";
    for (int i=0;i<str.length();i=i+1){
     out=out+str.substring(i,i+1)+str.substring(i,i+1);
    }
    return out;
  }
}
