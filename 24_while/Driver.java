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

	int matches=0;
  int headsTotal=0;
  // arbitrary int x
  int x=120000;
	while ((matches<=65536) || ((matches%2005)>0) || (matches==0) || (headsTotal<=x) ) {
		wayne.flip();
		yours.flip();
    headsTotal=wayne.getHeadsCtr()+yours.getHeadsCtr();
		if (yours.equals(wayne)) {
			matches=matches+1;
		}
	}
	System.out.println("We have had " + matches +" matches");
  System.out.println("We have had " + headsTotal +" totals heads");
  System.out.println("We have had " + (wayne.getTailsCtr()+yours.getTailsCtr()) +" totals tails");
  System.out.println("wayne has landed on heads " + wayne.getHeadsCtr() + " times and tails " + wayne.getTailsCtr() + " times");
  System.out.println("yours has landed on heads " + yours.getHeadsCtr() + " times and tails " + yours.getTailsCtr() + " times");
  }//end main()

}//end class
