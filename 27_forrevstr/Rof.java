// Jason Zhou, Justin Mohabir, Joshua Yagupsky (Team Jumping Jackals)
// APCS
// HW27: FOR the Love of Strings
// 2021-28-20
// time spent: 0.4 hours

/*
QCC:
DISCO:
You can do recursion where you call the function multiple times within its own definition. This helps with making the code more efficient.
*/
public class Rof {
  public static String fenceF(int n){
    String a = "|";
    for(int i=1; i<n; i++){
      a += "--|";
    }
    return a;
  }
  public static String reverseF(String forward){
    String a = "";
    for(int i = forward.length(); i>0; i--){
      a += forward.substring(i-1,i);
    }
    return a;
  }
  public static String reverseR(String forward){//Our recursive approach splits the string in half, reverses the substrings, and adds them back together in reverse order.
    int halfway = forward.length() / 2;
    if (forward.length() == 1){
      return forward;
    }
    else{
      return reverseR(forward.substring(halfway))+reverseR(forward.substring(0, halfway));
    }
  }
  public static void main(String[] args){
    System.out.println(fenceF(5));
    System.out.println(reverseF("stressed"));
    System.out.println(reverseR("stressed"));
  }
}
