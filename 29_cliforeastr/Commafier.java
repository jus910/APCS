/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred)
APCS
HW 29: Which Way Do You Roll?
2021 11 3

QCC:
  - Can we always use a while loop or for loop when asked to make an iterative method?
Disco:
  - toString() is a method of class Integer that takes an int and returns a str
    - Integer.toString(int a) -> str a
  - We should use variables in place of large operations we do many times
  - for this loops work like:
    -for (thing : list){do stuff to each thing in list}
time spent: 1.5 hrs
*/

public class Commafier{
  public static String commafyF(int num){
    String str = Integer.toString(num);

    int r = str.length()%3;

    String output = str.substring(0,r);

    for(int i=r;i<str.length();i=i+3){
      output = output + "," + str.substring(i,i+3);
    }
    if (r==0){
      return output.substring(1);
    }
    return output;
  }

  public static String commafyR(int num){

    String str = Integer.toString(num);

    if (str.length()<=3){
      return str;
    } else {
      String v=str.substring(0,str.length()-3); // v will remove the last 3 digits of the number
      return commafyR(Integer.parseInt(v)) + "," + str.substring(str.length()-3); //the latter part will add the last 3 digits back
    }
  }

  public static void main(String[] args){
    // System.out.println(commafyF(12345678));
    // System.out.println(commafyF(1234567));
    // System.out.println(commafyF(123456));
    // System.out.println(commafyF(1000));
    // System.out.println(commafyF(1));

    // System.out.println(commafyR(12345678));
    // System.out.println(commafyR(1234567));
    // System.out.println(commafyR(123456));
    // System.out.println(commafyR(1000));
    // System.out.println(commafyR(1));

    for (String s: args){
      System.out.println(commafyR(Integer.parseInt(s)));
      System.out.println(commafyF(Integer.parseInt(s)));
    }
  }
}
