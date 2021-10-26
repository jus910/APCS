/*
Team Potato Pounders (Human: Justin, Ari; Ducks: Alfred, Javier)
APCS
HW24 -- Get It While You Can
2021-10-25
time spent: 0.6 hours
QCC:
DISCO:
*/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;

  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    upFace = "heads";
    bias = 0.5;
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/

  public Coin( String s ) {
    assignValue(s);
    name = s;
    upFace = "heads";
    bias = 0.5;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    assignValue(s);
    name = s;
    upFace=nowFace;
    bias = 0.5;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if (s=="penny"){
      value=0.01;
    } else if(s=="nickel"){
      value=0.05;
    } else if(s=="dime"){
      value=0.10;
    } else if(s=="quarter"){
      value=0.25;
    } else if(s=="half dollar"){
      value=0.50;
    } else if(s=="dollar"){
      value=1.00;
    } else {
      System.out.println("Please put a valid coin");
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    if (s=="heads" || s=="tails"){
      name=s;
    }
    if (d>=0 && d<=1.0){
      bias=d;
    }
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    if (Math.random()<bias){
      headsCtr=headsCtr+1;
      upFace="heads";
    } else {
      tailsCtr=tailsCtr+1;
      upFace="tails";
    }
    return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return upFace==other.upFace;
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return name + "--" + upFace;
  }

}//end class
