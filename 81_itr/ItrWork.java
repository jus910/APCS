/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

 /***
    DISCO

    QCC

    SUMMARY THE FIRST:

    SUMMARY THE SECOND:

**/



import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for (int k : L) {
      if (k==key) return true;
    }
    return false;
   }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()) {
      if ((int) it.next() == key) return true;
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int b : L) {
      if (b%2==1) a.add(b);
    }
    return a;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    ArrayList<Integer> a = new ArrayList<Integer>();
    Iterator it = L.iterator();
    while (it.hasNext()) {
      int next = (int) it.next();
      if (next%2 == 1) a.add(next);
    }
    return a;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()) {
      int next = (int) it.next();
      if (next%2 == 0) it.remove();
    }

  }


  public static void main( String [] args )
  {

    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    System.out.println("Contents (for each loop):");
    String s = "";
    for (int x : L) {
     s+=x+", ";
    }
    System.out.println(s.substring(0, s.length()-2)+"\n");

    // b) explicitly using an iterator
    System.out.println("Contents (iterator):");
    s = "";
    Iterator it = L.iterator();
    while (it.hasNext()) {
      s+= it.next() + ", ";
    }
    System.out.println(s.substring(0, s.length()-2)+"\n");
    



    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
