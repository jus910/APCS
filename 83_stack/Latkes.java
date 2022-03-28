/***
 Watermelon: Justin Mohabir, Jomin Zhang, Anthony Sun
 APCS pd7
 HW83: Stacks on Stacks 2022-03-28
 time spent: 0.5hr + class time
**/

/***
    DISCO
      - We must check if the a stack is empty or full before adding or removing anything
    QCC
      - How are stacks useful, or at least more useful than lists?
 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stackSize = 0;
    _stack = new String[initCapacity];
  }// O(n)


  //means of insertion
  public void push( String s )
  {
    if (isFull()) return;
    _stack[_stackSize] = s;
    _stackSize++;
    /* your
       SIMPLE
       SMART
       magicks
       here
    */
  }// O(1)


  //means of removal
  public String pop( )
  {
    if (isEmpty()) return "";
    _stackSize--;
    return _stack[_stackSize];
  }// O(?)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize==0;
  }// O(?)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
  }// O(?)


  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
