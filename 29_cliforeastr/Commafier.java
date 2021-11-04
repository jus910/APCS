/***
 * The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred)
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-03
 * time spent: 0.67hrs
 * QCC:
 		- Is there a better way to call a part of a string other than using substring?
 * Disco:
 		- The contains method returns a boolean on whether the input string is inside the string that called it
 		- Using final when initializing a variable will indicate that it will not be changed or edited
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  // It gives us a refrence that we can use in all of our methods
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    return w.contains(letter);
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    return hasA(VOWELS, letter);
    /* YOUR IMPLEMENTATION HERE */
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int counter=0;
    for (int i=0; i<w.length();i++){
      if (isAVowel(w.substring(i,i+1))){
        counter++;
      }
    }
    return counter;
    /* YOUR IMPLEMENTATION HERE */
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    for (int i=0; i<w.length();i++){
      if (isAVowel(w.substring(i,i+1))){
        return true;
  		}
    }
    return false;
  }

  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    String output = "";
    for (int i=0; i<w.length();i++){
      if (isAVowel(w.substring(i,i+1))){
        output = output + w.substring(i,i+1);
  		}
    }
    return output;
    /* YOUR IMPLEMENTATION HERE */
  }


  public static void main( String[] args )
  {
    System.out.println(hasA("cat", "a")); //returns true
    System.out.println(hasA("cat", "p")); //returns false
    System.out.println("//");
    System.out.println(isAVowel("a")); //returns true
    System.out.println(isAVowel("z")); //returns false
    System.out.println("//");
    System.out.println(countVowels("meatball")); //returns 3
    System.out.println("//");
    System.out.println(hasAVowel("cat")); //returns true
    System.out.println(hasAVowel("zzz")); //returns false
    System.out.println("//");
    System.out.println(allVowels("meatball")); //returns "eaa"
  }//end main()

}//end class Pig
