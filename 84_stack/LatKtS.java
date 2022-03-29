/*
Watermelon: Justin, Anthony, Jomin
APCS pd7
hw84 - stack manipulation
2022-03-29
time spent: 30 min
*/

/*
DISCO:
- It's best to use the isEmpty() method rather than checking if peek element is null. built in functionality already
- for allMatched, we can only pop off a label if that label corresponds to the closing bracket/parentheses
QCC:
- do the test cases take care of all possible scenarios for allMatched?
*/

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      stack.push(s.substring(i,i+1));
    }

    String output = "";
    String pop = stack.pop();
    while (!pop.equals("")) {
      output+= pop;
      pop = stack.pop();
    }
    return output;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s ) // ({}[()])
  {
    Latkes stack = new Latkes(s.length());
    for (int i = 0; i < s.length(); i++) {
      String charAtIndex = s.substring(i,i+1);
      if (stack.isEmpty() && (charAtIndex.equals("}") || charAtIndex.equals("]") || charAtIndex.equals(")"))) return false;
      if (charAtIndex.equals("[")) stack.push("[");
      if (charAtIndex.equals("]") && stack.peek().equals("[")) stack.pop();
      
      if (charAtIndex.equals("{")) stack.push("{");
      if (charAtIndex.equals("}") && stack.peek().equals("{")) stack.pop();

      if (charAtIndex.equals("(")) stack.push("(");
      if (charAtIndex.equals(")") && stack.peek().equals("(")) stack.pop();
      // System.out.println(charAtIndex+": "+stack);

    }
    return stack.isEmpty();
  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
