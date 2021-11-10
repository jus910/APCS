import java.util.Scanner;
public class Pig{

  private static final String VOWELS = "aeiouAEIOU";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";


  /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/
  public static boolean hasA( String w, String letter ) {

    return w.indexOf(letter) != -1;

    /* equiv code, wo using indexOf()...
       boolean ans = false;
       for( int i = 0; i < w.length(); i++ ) {
       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
       }
       }
       return ans;
    */
  }//end hasA()


  /**
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    **/
  public static boolean isAVowel( String letter ) {
    return VOWELS.indexOf( letter ) != -1;
  }


  /**
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    **/
  public static int countVowels( String w ) {

    return allVowels(w).length();

    /* long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {
       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
    */
  }


  /**
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
    **/
  public static boolean hasAVowel( String w ) {
    // return w.indexOf(w) >= 0;
    return countVowels(w) > 0;
  }


  /**
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    **/
  public static String allVowels( String w ) {

    String ans = ""; //init return String

    for( int i = 0; i < w.length(); i++ ) {

      if ( isAVowel( w.substring(i,i+1) ) )
        ans += w.substring( i, i+1 ); //grow the return String
    }
    return ans;
  }


  /**
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    **/
  public static String firstVowel( String w ) {

    String ans = "";

    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);

    return ans;
  }


  /**
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    **/
  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/

  public static boolean isPunc( String symbol ) {
	   return PUNCS.indexOf( symbol ) != -1;
    }

  public static boolean isUpperCase( String letter ) {
    return CAPS.indexOf(letter) != -1;
    }

  public static boolean hasAPunc( String w ) {
        for(int i = 0; i < w.length(); i++){
            if (isPunc(w.substring(i, i + 1))) {return true;}
          }
        return false;
      }

  public static boolean beginsWithUpper( String w ) {
    return isUpperCase(w.substring(0,1) );
    }

    public static boolean endsWithPunc( String w ) {
      return PUNCS.indexOf(w.substring(w.length()-1)) != -1;
      }

  public static String engToPig( String w ) {
    String ans = "";
      if ( beginsWithVowel(w) ){
        if (endsWithPunc(w)) {ans = w.substring(0,w.length()-1) + "way" + w.substring(w.length()-1);}
        else{ ans = w + "way";}
      }
      else {
          if( !firstVowel(w).equals("")){
              int vPos = w.indexOf( firstVowel(w) );
              if (beginsWithUpper(w)){
                ans = (w.substring(vPos,vPos+1)).toUpperCase() + w.substring(vPos+1);
                // the new first letter is capatlized, and the string is added to the end
                ans = ans + w.substring(0,vPos).toLowerCase()  + "ay";
                // the og first letter is added to the end with the other letters and ay
              }
              if (endsWithPunc(w)){
                ans = w.substring(vPos-1,w.length()-1) + w.substring(0,vPos) + "ay" + w.substring(w.length()-1);
              }
              else{ans = w.substring(vPos) + w.substring(0,vPos) + "ay";}
            }
          else{
            if (beginsWithUpper(w)) {
              ans = (w.substring(w.length() - 1 )).toUpperCase() + w.substring(0, w.length() - 1).toLowerCase() + "ay";
            }
            if (endsWithPunc(w)){
              ans = w.substring(w.length() - 2 ) + w.substring(0, w.length() - 2) + "ay"+ w.substring(w.length()-1);
            } else {
              ans = w.substring(w.length() - 1 ) + w.substring(0, w.length() - 1) + "ay";
            }
          }
      }
      return ans;
    }

  public static String phraseToPig(String w){
    String ans="";
    int startIndex=0;
    if (w.indexOf(" ")==-1){
      return engToPig(w);
    } else {
      for(int i=0;i<w.length();i++){
        if ((w.substring(i,i+1)).equals(" ")){
          ans = ans + engToPig(w.substring(startIndex,i)) + " ";
          startIndex=i+1;
        }
      }
      return ans;
    }
  }

  public static void main( String[] args ) {

    Scanner sc = new Scanner( System.in );
    while( sc.hasNext() ) {
      System.out.println( "phraseToPig \t" + phraseToPig(sc.next()) );
    }

  }//end main()

}//end class Pig
