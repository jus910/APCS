/* <Justin> <Mohabir>
APCS
HW<13> -- <Where do BigSibs Come From?/java_intro/mainclass>
<2021>-<10>-<07>
QCC: Are my discos are correct?
Disco:
  We need to initialize global vars outside of any method before we can use them.
  The constructor returns no value*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib("Word Up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    String greeting2;
    BigSib richard2 = new BigSib("*Slides through doorway* Hey");

    greeting2 = richard2.greet("Jerry");
    System.out.println(greeting2);
  }
}
