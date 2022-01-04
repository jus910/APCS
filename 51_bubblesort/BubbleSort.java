// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent: 1 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * 1. Iterate from right to left
 * 2. With every iteration, compare the value at the current index, to the value at index - 1
 * 3. If the value at the current index is smaller, then swap
 * 4. Stop iterating when the index is 1
 * 5. Repeat steps 1 to 5, for size - 1 times
 *
 * DISCO
 * for each loops can be used on ArrayLists
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: It's completely sorted
 * q1: After pass p, what do you know?
 * a1: There are p elements in the correct position
 * q2: How many passes are necessary to completely sort?
 * a2: size - 1
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
  	Comparable currentVal;
  	Comparable previousVal;
    int passes = data.size()-1;
    while (passes > 0) {
  	    for(int i = data.size()-1; i>0; i--){
  		    if (data.get(i).compareTo(data.get(i-1)) == -1){
  			    currentVal=(data.get(i));
  			    previousVal=(data.get(i-1));
  			    data.set(i,previousVal);
  			    data.set((i-1),currentVal);
  		    }
  	    }
        passes--;
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> copy = new ArrayList<Comparable>();
    for(Comparable ddd: input){
      copy.add(ddd);
    }
    bubbleSortV(copy);
    return copy;

  }


  public static void main( String [] args )
  {
      /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
