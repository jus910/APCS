/*
Team Tem: Justin Mohabir, Neil Lin; Turtles: Hans, Hatch
APCS pd07
HW61 -- Instructions so Simple...
2022-02-08
time spent: 1.0 hrs
DISCO:
- You can prevent OutOfBound errors by accounting for the indices that can potentially cause an error.
- We realized that the sort() method works recursively, so we used a base case of having 1 card, which
  would mean that array is sorted, and then created new arrays with each half of the inputted array,
  which we then repeated called merge() on after sorting each half.
QCC:
- What's the runtime complexity of Merge Sort?
*/

/***
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm:
    Merge, assuming the two lists are sorted in ascending order, merges the two lists.
    Sort sorts.
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
   private static int[] merge( int[] a, int[] b )
   {
     int aPos = -1, bPos = -1, outPos = 0;
     int[] out = new int[a.length + b.length];
     for(int i = 0; i < out.length; i++){
       if (bPos == b.length-1){
         aPos++;
         out[i] = a[aPos];
       }
       else if (aPos == a.length-1){
         bPos++;
         out[i] = b[bPos];
       }
       else if(a[aPos+1] >= b[bPos+1] ) {
         bPos++;
         out[i] = b[bPos];
       }
       else if(a[aPos+1] < b[bPos+1] ) {
         aPos++;
         out[i] = a[aPos];
       }
     }
     return out;


   }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    int[][] arrays = new int[arr.length-1][1];
    int[] out = new int[0];
    // This turns every element into a list
    for(int i = 0; i<arr.length-1; i++){
      arrays[i][0] = arr[i];
    }
    // A for loop that merges all the elements in the list
    for(int i=0; i<arr.length-1; i++){
      out = merge(out,arrays[i]);
    }
    return out;
  }//end sort()

  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};
      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );
      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6));

      System.out.println("\nSorting arr4-7...");

      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
