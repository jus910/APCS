// Team Team: Brian Li, Justin Mohabir, Neil Lin; Ducks: Robert, Hans, Hatch
// APCS pd07
// L06 -- Read/Review/Expand
// 2022-02-11
// time spent: 1.3 hours

public class OpenEnded{
  final static String LETTERS = "abcdefghijklmnopqrstuvwxyz";

  // reverse words
  public static String reverso(String phrase){ // reverses each word in a phrase
    String reversedPhrase = "";
    String nextWord = "";
    phrase += " ";
    while(phrase.length() > 0 && phrase.indexOf(" ") > -1){
      nextWord = phrase.substring(0, phrase.indexOf(" ")); // finds next word
      reversedPhrase += reverseWord(nextWord) + " "; // adds reversed word to reversedPhrase
      phrase = phrase.substring(phrase.indexOf(" ") + 1); // removes nextWord from phrase
    }
    return reversedPhrase;
  }

  public static String reverseWord(String word){ // reverses the characters in a word
    boolean capitalizeFirstChar = false;
    String reversed = "";
    String punc = getPunctuation(word);
    word = removePunctuation(word);
    String lowercase = word.toLowerCase();
    if (!(lowercase.equals(word))){
      capitalizeFirstChar = true;
    }
    for (int i = word.length() - 1; i > -1; i--){
      reversed += word.substring(i, i+1);
    }
    reversed += punc;
    if (capitalizeFirstChar){
      reversed = (reversed.substring(0, 1)).toUpperCase() + (reversed.substring(1)).toLowerCase();
    }
    return reversed;
  }

  // ROT13 for phrase
  public static String rotPhrase(String phrase){ // rotates each word in a phrase 13 characters
    String rotatedPhrase = "";
    String nextWord = "";
    phrase += " ";
    while(phrase.length() > 0 && phrase.indexOf(" ") > -1){
      nextWord = phrase.substring(0, phrase.indexOf(" ")); // finds next word
      rotatedPhrase += rotWord(nextWord) + " "; // adds reversed word to reversedPhrase
      phrase = phrase.substring(phrase.indexOf(" ") + 1); // removes nextWord from phrase
    }
    return rotatedPhrase;
  }

  // ROT13 for word
  public static String rotWord(String word){ // rotates each letter in word 13 characters
    boolean capitalizeFirstChar = false;
    int rotIndex = 0;
    String rotated = "";
    String punc = getPunctuation(word);
    word = removePunctuation(word);
    String lowercase = word.toLowerCase();
    if (!(lowercase.equals(word))){
      capitalizeFirstChar = true;
    }
    for (int i = 0; i < word.length(); i++){
      if (LETTERS.indexOf(lowercase.substring(i, i+1)) > -1){ // letter in lowercase is present
        rotIndex = LETTERS.indexOf(lowercase.substring(i, i+1)) + 13;
        if (LETTERS.indexOf(lowercase.substring(i, i+1)) + 14 > LETTERS.length()){ // out of bounds
          rotIndex = rotIndex - 26; // loops back around to find correct index of rotated character
        }
        rotated += LETTERS.substring(rotIndex, rotIndex + 1);
      }
      else{
        rotated += lowercase.substring(i, i+1);
      }
    }
    rotated += punc;
    if (capitalizeFirstChar){
      rotated = (rotated.substring(0, 1)).toUpperCase() + (rotated.substring(1)).toLowerCase();
    }
    return rotated;
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is none
   */
  public static String getPunctuation( String word )
  {
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

  /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }

    return word;
  }

  public static void main(String[] args){
    System.out.println(reverso("Hello, world!"));
    System.out.println(rotPhrase("Hello, world!"));
  }
}
