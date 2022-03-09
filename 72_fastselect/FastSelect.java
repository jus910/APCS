// Team Anthing| Anthony Sun, Jomin Zhang, Justin Mohabir
// APCS pd07
// HW72 -- So So Fast
// 2022-03-08r
// time spent: 0.5  hrs
/***
Algo; Partition the list y times and return the yth Value
BEST CASE SCENARIO: The list is sorted in descending order. The run time is O(n^2) because it must partition n times, and the partition is O(n)
WORST CASE SCENARIO: The list is sorted in ascending order. The run time is O(n^2) because it must partition n times, and the partition is O(n)
Disco: If you partition the same list for long enough at the final value it becomes sorted
QCC: 
  Is there a more efficient way?
  How do we address multiple variables when it comes to time complexity?
***/
public class FastSelect{
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  public static int Partition( int arr[], int a, int b, int c)
  {
    int v = arr[c];

    swap( c, b, arr);
    int s = a;

    for( int i = a; i < b; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,b,arr);

    return s;
  }//end Partition
  // everything less than the value at c will be to the left of the pivot

  public static int fastSelect( int arr[], int y)
  {
    for(int i=0;i<arr.length;i++){
      Partition(arr, 0, arr.length-1, y-1);
      //printArr(arr);
    }
    return arr[y-1];
  }//end Partition

  public static void main(String[] args){
    // test case
    int[] arr1 = {8,21,17,69,343};
    printArr(arr1);
    for(int i=1; i<=arr1.length;i++){
      shuffle(arr1);
      System.out.println(fastSelect(arr1,i));
    } // Should print elements in doscending order

    // best case with y at the upper bound
    int[] arr2 = {0,1,2,3,4};
    printArr(arr2);
    System.out.println(fastSelect(arr1,4));

    // worst case with y at the upper bound
    int[] arr3 = {4,3,2,1,0};
    printArr(arr3);
    System.out.println(fastSelect(arr1,4));
  }
}
