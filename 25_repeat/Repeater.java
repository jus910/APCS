/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred, Javier)
APCS
HW25: Do I repeat myself?
2021 10 27
QCC:
Disco:
time spent: 0.5 hrs
*/

public class Repeater{
  public static String fenceW(int input){
    String output="";
    while (input>1){
      output=output+"|--";
      input=input-1;
    }
    output=output+"|";
    return output;
  }

  public static String fenceR(int input){
    String output="";
    if (input>1){
      output=output+"|--";
      output=output+fenceR(input-1);
    } else if (input==1){
      output=output+"|";
    }
    return output;
  }

  public static void main(String[] args){
    System.out.println("This fenceW");
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceW(3));
    System.out.println("This fenceR");
    System.out.println(fenceR(1));
    System.out.println(fenceR(2));
    System.out.println(fenceR(3));
  }
}
