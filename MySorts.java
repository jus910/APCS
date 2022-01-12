// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW54 -- One File to Bring Them All...
// 2022-01-11
// time spent: 0.3 hrs


import java.util.ArrayList;

public class MySorts {
 
 /******************************
 * ALGO:
 * 1. Iterate from right to left
 * 2. With every iteration, compare the value at the current index, to the value at index - 1
 * 3. If the value at the current index is smaller, then swap
 * 4. Stop iterating when the index is 1
 * 5. Repeat steps 1 to 5, for size - 1 times
 ******************************/
  
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
  
 /******************************
 * ALGO:
 * 1. Start at the last index
 * 2. Iterate right to left looking for the biggest value to the left of the current index
 * 3. Swap the selected value with the value at the current index. If no larger value is found, then the current value swaps with itself and is unchanged
 * 4. Repeat steps 2 and 3 for each index for size-1 passes
 ******************************/
  
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    Comparable currentVal;

    for(int i=data.size()-1;i>0;i--) {
      System.out.println( "\nbegin pass " + (data.size()-i) );//diag
      maxPos=i;

      for(int n=i;n>=0;n-- ) {
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
        if (data.get(maxPos).compareTo(data.get(n)) == -1){
        	maxPos=n;
        }

      }

      currentVal=data.get(i);
      data.set(i,data.get(maxPos));
      data.set(maxPos,currentVal);

      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  /******************************
 * ALGO:
 * 1. Partition the list into sorted and undorted sections, with the partition starting at index 1
 * 2. Create a variable i with the same value as the partition
 * 3. If the value at i is less than the value at i-1, then swap
 * 4. Decrement i by 1, and repeat step 3 until the value is sorted relative to the section to the left of the partition
 * 5. Increment partition by 1
 * 6. Repeat steps 2 - 5 until i is equal to the size-1
 ******************************/
  
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for(int partition=1;partition<data.size();partition++  ) {
      //partition marks first item in unsorted region
      Comparable currentVal;

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i=partition;i>0;i--  ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) == -1  ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          currentVal=data.get(i);
          data.set(i,data.get(i-1));
          data.set(i-1,currentVal);
          
        }
        else
          break;
      }
    }
  }//end insertionSortV
