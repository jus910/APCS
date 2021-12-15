// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW47 -- Guess Again
// 2021-12-15w
// time spent: 0.3 hrs

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
    DISCO:
    - You can do this: private int _lo, _hi, _guessCtr, _target;
    	- Declare all variables at once
    - break will break the loop, anywhere, and then continue reading code
    - return will end the method, and will not read the rest of the code
    QCC:
    -
 ***/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 1;

    //pick random number in range [a,b]

    _target= (int)(Math.random()*(b-a)+a);

  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

    //3 cases: we either found it, too hi, too lo
    if ((guess > _hi) || (guess < _lo)) {
      System.out.println("Your guess is out of range");
      playRec();
      _guessCtr++;
    }

    if(guess == _target) {
    	System.out.println("You guessed the number correctly!");
    	System.out.println("You took this many times to guess: " + _guessCtr);
    	}

    else if(guess > _target) {
    	System.out.println("Too high");
    	_hi=guess-1;
    	_guessCtr++;
    	this.playRec();
    	}

    else if(guess < _target) {
 			System.out.println("Too low");
    	_lo=guess+1;
    	_guessCtr++;
    	this.playRec();
    	}

  }


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;

    while( true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo
      if(guess == _target) {
        System.out.println("You guessed the number correctly!");
    		System.out.println("You took this many times to guess: " + _guessCtr);
        break;
      }

      if ((guess > _hi) || (guess < _lo)) {
      	System.out.println("Your guess is out of range");
   		}

      else if(guess > _target) {
    		System.out.println("Too high");
    		_hi=guess-1;
    	}

      else if(guess < _target) {
 				System.out.println("Too low");
    		_lo=guess+1;
    	}
      _guessCtr++;
    }
  }


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    //playRec();
    playIter();

  }


  //main method to run it all
  public static void main( String[] args )
  {

    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //start the game
    g.play();
    /*-----------------------------
    -----------------------------*/
  }

}//end class GuessNumber
