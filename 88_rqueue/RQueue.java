/* Watermelon: Justin, Anthony, Jomin
apcs pd7
hw87 - queue
2022-04-04
time spent: 0.5 hr
*/

/*
DISCO:
 - We have to traverse to the node before the one we want to remove
QCC:
 - Why are making dequeue random and not enqueue
  - It does not make sense to serve people randomly, but it does make sense for people to cut the line
 - We had to use an instance variable to make sure that peekFront worked, is there any other way?

/***
 * class RQueue
 * SKELESWASHBUCKLEON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;
  private int randVal;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = new LLNode<SWASHBUCKLE>(null, null);
    _end = _front;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
    if (_front.getCargo()==null) {
      _end.setCargo(enQVal);
      return;
    }
    _end.setNext(new LLNode<SWASHBUCKLE>(enQVal, null));
    _end = _end.getNext();
    _size ++;
    randVal = (int) (Math.random() * _size);
  }//O(1)


  // remove and return thing at front of queue (removes random element according to assignments page)
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    SWASHBUCKLE foo;
    LLNode<SWASHBUCKLE> dummy = _front;
    if(_size==1){
      foo = _front.getCargo();
      _front.setCargo(null);
      _size--;
      return foo;
    } else{
      for(int i=0;i<randVal-1;i++){
        dummy=dummy.getNext();
      }
      foo = dummy.getNext().getCargo();
      dummy.setNext(dummy.getNext().getNext());
      _size --;
      randVal = (int) (Math.random() * _size);
      return foo;
    }
  }//O(n)


  public SWASHBUCKLE peekFront()
  {
    SWASHBUCKLE foo;
    LLNode<SWASHBUCKLE> dummy = _front;
    randVal = (int) (Math.random() * _size);
    for(int i=0;i<randVal-1;i++){
      dummy=dummy.getNext();
    }
    return dummy.getNext().getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   We use the power of the random dequeue, which will remove and return a random element, and then we add that element to the back with enqueue
   **/
  public void sample()
  {
    for(int i=0;i<_size;i++){
      this.enqueue(this.dequeue());
    }
  }//O(n^2) There is definately a more time efficient way, but this code was too simple not to use


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String s = "";
    LLNode<SWASHBUCKLE> temp = _front;
    while (temp.getNext()!= null){
      s += temp.getCargo() + ",";
      temp = temp.getNext();
    }
    return s + _end.getCargo();
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {



    RQueue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...
    System.out.println("\nshuffle...");
    PirateQueue.sample();
    System.out.println( PirateQueue );

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.peekFront() ); System.out.println( PirateQueue.dequeue() );
  /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
