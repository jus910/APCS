// Team Team: Brian Li, Justin Mohabir, Neil Lin; Ducks: Robert, Hans, Hatch
// APCS pd07
// HW65 -- Solving nQueens
// 2022-02-16
// time spent: 1 hrs

/*
DISCO
- There is no solution for a 2x2 or 3x3 chess board.
- When we render a possible branch useless, we can "undo" our last move using removeQueen() and go to the next possibility.

QCC
- Why is there no solution only for the 2x2 or 3x3 board?
- How can we display ALL solutions for a given chess board?
*/

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve()
  {
    boolean isSolved = solveH(0); // solve, starting at column 0
    printSolution();
    if (isSolved){ return true; }
    else { return false; }
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col )
  {
    if (col >= _board.length){ return true; } // reaches end of board with one queen placed per column

    // places Q at next allowed cell in col
    for (int i = 0; i < _board.length; i++){
      if (_board[i][col] == 0){ // empty spot found
        addQueen(i, col);
        if (solveH(col + 1)){
          return true; // queen present once per column
        }
        else{
          removeQueen(i, col); // else, queen is NOT present once per column.
                               // place at next available cell and repeat.
        }
      }
    }

    return false; // if this point is reached, a queen has not been placed in this column.
                  // therefore, this branch does not work.
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        if (_board[r][c] == 1){
          ans += "Q" + "\t";
        }
        else{
          ans += "_" + "\t";
        }
      }
      ans += "\n";
    }
    System.out.println(ans);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * Places a queen at position row x col, and marks off all cells that can no
     longer have a queen (to the right and diagonally)
   * precondition: input row and col within 0 and n
   * postcondition: places Queen, marked with 1, and marks restrictions (-1)
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * If a queen is present at position row x col, that queen is then removed, as well
     as all restrictions that resulted from that queen at that position.
   * precondition: input row and col within 0 and n
   * postcondition: if Queen, removes Queen, sets to 0, and removes restrictions (-1)
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * overwritten toString() method to display the chess board and its values
   * precondition: _board exists
   * postcondition: overwrites toString() method to show the board as a String
   */
  public String toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */

    System.out.println("Testing solves...");

    QueenBoard board;
    for (int i = 1; i <= 20; i++){
      board = new QueenBoard(i);
      board.solve();
    }
  }

}//end class
