public class LLNode<T>
{
  //instance vars
  private T _cargo;
  private LLNode<T> _nextNode;

  // constructor
  public LLNode( T value, LLNode<T> next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo()
  {
    return _cargo;
  }

  public LLNode<T> getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo )
  {
    T foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode<T> setNext( LLNode<T> newNext )
  {
    LLNode<T>  foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return (String) _cargo;
  }

}//end class LLNode
