// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW40 -- 2D arrays
// 2021-11-30
// Time spent: .8 hours

/*
QCC:
	- The nested for loop structure repeats a lot in the methods we wrote, so is there a way to put that structure into a helper method?
DISCO:
	- For int [][] m1 = new int[4][2]; 
  		m1.length = 4 		//the length of the column
   		m1[0].length = 2 	//the length of the first row
  - Java also let us declare 3d and 4d arrays, though at that point, the analogy to dimensions starts to falter
*/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    String output = "";

    for(int x = 0; x < a.length; x++) {
        for(int y = 0; y < a[x].length; y++) {
            output += a[x][y];
            output += " ";
        }
        System.out.println(output);
        output = "";
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    String output = "";

    for(int[] x : a) {
        for(int y : x) {
            output += y;
            output += " ";
        }
        System.out.println(output);
        output = "";
    }
    System.out.print("\n");
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum = 0;
    for(int x = 0; x < a.length; x++) {
        for(int y = 0; y < a[x].length; y++) {
            sum += a[x][y];
        }
    }
    return sum;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int sum = 0;
    int row = 1;

    for(int[] x : m) {
        sum += sumRow(row, m);
        row++;
    }
    return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int sum = 0;
    for(int x = 0; x < a[r - 1].length; x++) {
        sum += a[r - 1][x];
    }
    return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int sum = 0;

    for(int x : m[r -1]) {
        sum += x;
    }
    return sum;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sumRow...\n");
      System.out.println("sum m1, row 1 : " + sumRow(1, m1));
      System.out.println("sum m2, row 2 : " + sumRow(2, m2));
      System.out.println("sum m3, row 3 : " + sumRow(3, m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      System.out.print("testing sumRow2...\n");
      System.out.println("sum m1, row 1 : " + sumRow2(1, m1));
      System.out.println("sum m2, row 2 : " + sumRow2(2, m2));
      System.out.println("sum m3, row 3 : " + sumRow2(3, m3));
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
