/*
Team Potato Pounders (Human: Justin, Ari; Ducks: Alfred, Javier)
APCS
HW24 -- Get It While You Can
2021-10-25
time spent: 0.6 hours
QCC:
DISCO:
*/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin


    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
	int matches=1;
	while ((matches<=65536) && ((matches%2005)>0)) {
		wayne.flip();
		yours.flip();
		if (yours.equals(wayne)) {
			matches=matches+1;
		}
	}
	System.out.println("You have had " + matches +" matches");

  }//end main()

}//end class
