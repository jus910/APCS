//Watermelon: Justin, Anthony, Jomin
//APCS pd7
//HW78 -- doubly linked nodes
//2022-03-17r
//time spent: 0.5h + class time

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

/*
DISCO:
* this is pretty similar to LLNode, except that we have to handle changing the previous node
QCC:
* does constructing the DLLNode class require getPrev to be called?
ALGO ADD:
* create new node with newVal, null previous, and _head as next
* set node to _head
* set the previous value in the next node to _head
ALGO REM:
* iterate up to element before the one set to be removed
* change the next node to the pointer after the one set to be removed (2x next)
* update the new next node's prev pointer to the current node
*/

public class DLLNode
{
  //instance vars
  private String _cargo;
  private DLLNode _prevNode;
  private DLLNode _nextNode;

  // constructor
  public DLLNode( String value, DLLNode prev, DLLNode next )
  {
    _cargo = value;
    _prevNode = prev;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return _cargo;
  }

  public DLLNode getPrev()
  {
    return _prevNode;
  }

  public DLLNode getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode setPrev( DLLNode newPrev )
  {
    DLLNode foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }  

  public DLLNode setNext( DLLNode newNext )
  {
    DLLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo;
  }


}//end class LLNode
