/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    // Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
      System.out.println(cakes.isEmpty());
      cakes.push("aoo");
      cakes.push("boo");
      cakes.push("coo");
      cakes.push("doo");
      cakes.push("eoo");
      cakes.push("foo");
      cakes.push("goo");
      cakes.push("hoo");
      cakes.push("ioo");
      cakes.push("joo");
      cakes.push("coocoo");
      cakes.push("cachoo");
      System.out.println(cakes.isEmpty());
  
      //cachoo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //coocoo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //joo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //ioo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //hoo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //goo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //foo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //eoo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //doo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //coo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //boo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
      //aoo
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );
  
      //stack empty by now; SOP(null)
      System.out.println("Getting ready to remove "+cakes.peekTop());
      System.out.println("Removed "+ cakes.pop() );

  }//end main

}//end class
