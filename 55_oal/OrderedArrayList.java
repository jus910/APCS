// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW55: Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 1 hrs

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 *
 * typed for Integers
 *
 * ArrayList spec at
 * https://www2.cs.duke.edu/csed/ap/subset/doc/ap/java/util/ArrayList.html
 **********************************************/
/**
 * DISCO
 * 
 * QCC
 * 	- How do we know if something is O(log n) time 
 * 	- From reading we know binary O(log n), but from our current knowledge the binary looks like it is O(n)
 * 	- How can we find the actual way in which the ArrayList methods work? We based everything off what was written in SuperArray because we didn't where else to look.
**/

import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;
  
  // default constructor
  // initializes instance variables
  // O(1) because size isn't a factor
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }

  // O(1) because it will always take the same time regardless of size
  public String toString()
  {
    return _data.toString();
  }

	// O(n) for the worst case scenario, because it looks at each element once with each pass (One iteration through loop)
  	// The worst case would be when we remove something at the end because it would have to iterate through the entire collection to find its target
  // O(1) for the best case scenario because the loop will not run if the index is the same as the size, 
  public Integer remove( int index )
  {
    return _data.remove(index);
  }


  // O(1) because size doesn't affect how fast it returns an int
  public int size()
  {
    return _data.size();
  }


  // O(1) because it will always take the same time regardless of size, it only does one action per get
  public Integer get( int index )
  {
    return _data.get(index);
  }


  //insert at appropriate location to maintain sortedness
  // O(n) because it just calls eithe addLinear or addBinary, which we said were O(n)
  public boolean add( Integer newVal )
  {
    //call exactly 1 of the helper methods below...  your favorite?

    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  // O(n) for worst case because we iterate n times to get through the entire array, and the _data.add used is O(n), but is only called once, so addLinear doesn't become O(n^2)
  	// It's pretty much O(2n) which is O(n)
  	// The worst case is when we have to add the element at the end
  // O(n) for best case because it will always have to iterate through one of the loops (for loop, and _data.add)
  	// The best case is when we end one of the loops early by adding something that is less than the first value (to end the for loop) or by adding an element at an index of the size (to end _data.add)
  	// However, we cannot do both of these because an element cannot both be at the end and the beginning with an increasing size
  public void addLinear(Integer newVal)
  {
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  // O(n) for worst case scenario because even though a binary search is O(log n), which we proved with the linear vs binary lab, the add method is O(n) so it cancels
  	// Binary is O(log n) because it halves the size each time to search
  	// We think it would be something like O((log n) + n), which just simpflies to O(n)
  	// Worst Case would be at either of the extremes 
  // O(n) for the best case because the add method still has to iterate through the list, even if the search is only used once
  	// The best case would be in the middle
  public void addBinary(Integer newVal)
  {
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
  }
  }

}//end class OrderedArrayList
