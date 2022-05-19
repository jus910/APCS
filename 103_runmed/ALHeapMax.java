/**
Team Cookie (Justin Mohabir, Lawrence Joa, Lior Polischouk)
APCS pd7
HW102: Heap On Heapin' On
2022-05-16
time spent: 0.5 hrs
Disco:
 - The .set method in ArrayList returns the element previously at the specified position
 - The remove and add methods are O(log n) because we only need to traverse one branch
 QCC:
 - How are trees used?


 */

import java.util.ArrayList;

public class ALHeapMax
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeapMax()
  {
    _heap = new ArrayList<Integer>();
  }

  public int size(){
    return _heap.size();
  }




  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return _heap.toString();
  }//O(1)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return(_heap.size()==0);
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMax()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * Insert the value at the end of a level order, and then swap if the parent is greater
   */
  public void add( Integer addVal )
  {
    _heap.add(addVal);
    int childIndex = _heap.size()-1;
    int parentIndex=(childIndex+1)/2;
    while(parentIndex >= 0){
      if(_heap.get(parentIndex) < _heap.get(childIndex)){
        swap(parentIndex,childIndex);
        childIndex=parentIndex;
        parentIndex=(childIndex+1)/2;
      } else {
        return;
      }
      // With the while loop, the indexes will never equal 0 so we have to check now
      if(_heap.get(0) < _heap.get(1)){
        swap(1,0);
      }
    }

  }//O(log n)


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * Swaps the parent with the lesser child until it becomes a leaf, and then cut it off
   */
  public Integer removeMax()
  {
    int parentIndex = 0;
    int retVal = _heap.get(parentIndex);
    while(maxChildPos(parentIndex)>0){
      swap(parentIndex,maxChildPos(parentIndex));
      parentIndex=maxChildPos(parentIndex);
    }
    _heap.remove(parentIndex);
    return retVal;
  }//O(log n)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int maxChildPos( int pos )
  {
    int leftChildIndex = 2*pos + 1;
    int rightChildIndex = 2*pos + 2;
    if((leftChildIndex>_heap.size()-1 && rightChildIndex > _heap.size()-1) || pos<0 ){
      return -1;
    } else if(rightChildIndex < _heap.size()-1 ){
      // only one child
      return leftChildIndex;
    } else{
      if(_heap.get(leftChildIndex) > _heap.get(rightChildIndex) ) {
        return leftChildIndex;
      } else {
        return rightChildIndex;
      }
    }
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {

  }//end main()

}//end class ALHeap
