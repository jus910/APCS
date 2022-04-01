/*
Watermelon: Justin, Anthony, Jomin
APCS pd7
2022-03-31
time spent: 0.5 hr + class time
*/

/*
DISCO:
- we need some number finessing to subtract numbers backwards
  - add all the numbers up, and subtract from 2*(the leftmost/last number)
- we need to account for multi-digit numbers

QCC:
- Would it be better to use a stack to calculate the difference?
- how do we account for cases when spaces do not separate a number from a parenthesis or operator? e.g. ( + 1 3)
*/

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. split the expression by spaces to get significant parts of the expression
 *   2. for every string separated value:
 *      2a. if it equals an operator, add the corresponding number to an operator stack
 *      2b. if it is an ending parenthesis, add the output of unload* (which takes in the pop value of the operator stack—the latest operator seen) to the stack
 *      2c. otherwise, add the string-separated-value to the stack
 *   3. To unload:
 *      3a. evaluate the given expression according to the given operation by popping off values until starting parenthesis is reached
 *      3b. return the final evaluation
 *
 * STACK OF CHOICE: ArrayList by java standard library
 * b/c we want to be able to add and remove elements without an upper bound. Linked list would function identically.
 **/

public class Scheme
{
  private static final boolean DEBUG = false;
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    ALStack<String> stack = new ALStack<String>();
    Stack<Integer> opStack = new ALStack<Integer>();

    String[] exprList = expr.split("\\s+");
    for (String iChar : exprList) {
      if (iChar.equals("+")) {opStack.push(1); continue;}
      if (iChar.equals("-")) {opStack.push(2); continue;}
      if (iChar.equals("*")) {opStack.push(3); continue;}

      if (iChar.equals(")")) {
        stack.push(unload(opStack.pop(), stack));
      }
      else {
        stack.push(iChar);
      }

      if (DEBUG) System.out.println((ALStack<String>) stack );
    }
    String out = stack.pop();
    if (stack.isEmpty()) return out;
    return null;
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    int out;
    if (op==1) {
      out = Integer.parseInt(numbers.pop());
      while (!numbers.peekTop().equals("(")) {
        out += Integer.parseInt(numbers.pop());
      }
    }
    else if (op==2) {
      int tracking=0; //dummy init
      out = Integer.parseInt(numbers.pop());
      while (!numbers.peekTop().equals("(")) {
        tracking = Integer.parseInt(numbers.pop());
        out += tracking;
      }
      out = tracking*2 - out;
    }
    else {
      out = Integer.parseInt(numbers.pop());
      while (!numbers.peekTop().equals("(")) {
        out *= Integer.parseInt(numbers.pop());
      }
    }
    numbers.pop();
    return out+"";
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  */


  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
