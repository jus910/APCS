public class LList implements List //interface def must be in this dir
{

  //instance vars
  private DLLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new DLLNode(null, null, null);
    _size=0;
  }


  //--------------v  List interface methods  v--------------
  public boolean add( String newVal )
    {
      DLLNode tmp = new DLLNode( newVal, null, _head );
      _head = tmp;
      _size++;
      _head.getNext().setPrev(_head);
      return true;
    }

  public void add( int index, String newVal )
  {
    // if the size is 0, the newVal becomes the head
    DLLNode tempNode = _head;
    if(_size==0){
      _head.setCargo(newVal);
    } else{
      for(int i=0;i<index-1;i++){
        tempNode = tempNode.getNext();
      }
      tempNode.setNext(new DLLNode( newVal, tempNode, tempNode.getNext() ));
    }
    _size++;
  }

  public String remove (int index){
    DLLNode tempNode = _head;
    //tempPointer
    String removed = "";

    for (int i = 0; i < index-1; i ++){
        tempNode = tempNode.getNext();
    }
    removed = tempNode.getNext().getCargo();
    tempNode.setNext(tempNode.getNext().getNext());
    tempNode.getNext().setPrev(tempNode);
    _size--;
    return removed;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    // code
    // iterates through the list
    DLLNode tempNode = _head;
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
    DLLNode tempNode = _head;
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
    DLLNode tempNode = _head;
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
    james.add(3,"sick");
    System.out.println(james);
    james.add("test");
    System.out.println(james);
    System.out.println("Testing remove");
    //Removing Sick
    System.out.println(james.remove(3));
    //Expecting I got a beat
    System.out.println(james);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
