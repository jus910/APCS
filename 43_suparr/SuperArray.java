// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW43: Array of Steel
// 2021-12-6
// Time spent: 1 hours

/*
QCC:
  -
DISCO:
	-
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    /* YOUR IMPLEMENTATION HERE */
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String result = "[";
    int x = 0;

    if (_data.length==0){
      return "[]";
    }

    while (x<_data.length-1){
      result = result + _data[x] + ", ";
      x++;
    }
    result = result + _data[x] + "]";
    return result;

    /* YOUR IMPLEMENTATION HERE */
  }


  //double capacity of SuperArray
  private void expand()
  {
    /* YOUR IMPLEMENTATION HERE */
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return 0;
    /* YOUR IMPLEMENTATION HERE */
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    return 0;
    /* YOUR IMPLEMENTATION HERE */
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
