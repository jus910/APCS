// Watermelon: Justin Mohabir, Jomin Zhang, Anthony Sun
//APCS pd7
//HW76: We Got a Little Ol' Convoy
//2022-03-15
//time spent: 0.5hr + class time

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new LLNode(null, null);
    _size=0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    // if the size is 0, the newVal becomes the head
    LLNode tempNode = _head;
    if(_size==0){
      _head.setCargo(newVal);
    } else{
      // we need the _size-1 because we are setting the next node with a null value
      for(int i=0;i<_size-1;i++){
        tempNode = tempNode.getNext();
      }
      tempNode.setNext(new LLNode( newVal, null ));
    }
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    // code
    // iterates through the list
    LLNode tempNode = _head;
    for(int i=0;i<index;i++){
      tempNode = tempNode.getNext();
    }
    return tempNode.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    // code
    LLNode tempNode = _head;
    String tempVal;
    for(int i=0;i<index;i++){
      tempNode = tempNode.getNext();
    }
    tempVal=tempNode.getCargo();
    // this works because tempNode returns the location of the node we want to modify
    tempNode.setCargo(newVal);

    return tempVal;
  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String s = "[";
    LLNode tempNode = _head;
    //iterates through the list, adding the cargo
    for(int i=0;i<_size;i++){
      s=s+tempNode.getCargo() + ",";
      tempNode = tempNode.getNext();
    }
    s=s+"]";
    return s;
  }


  //main method for testing
  public static void main( String[] args )
  {

    LList james = new LList();
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println( "2nd item is: " + james.get(1) );
    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
