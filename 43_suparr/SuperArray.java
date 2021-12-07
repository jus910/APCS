// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW43: Array of Steel
// 2021-12-6
// Time spent: .2 hours

/*
QCC:
  - Should this class extend the int[] class?
DISCO:
	-
*/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _size = 10;
    _data = new int[_size];
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
    _size = _size * 2;
    int[] big_int = new int[_size];

    for(int i=0;i<_size/2;i++){
      big_int[i]=_data[i];
    }

    _data=big_int;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int oldVal=_data[index];
    _data[index]=newVal;
    return oldVal;
    /* YOUR IMPLEMENTATION HERE */
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
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
  }//end main()


}//end class
