// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW49 -- Rational Standards Compliance
// 2021-12-22
// Time spent: 1 hours

/*
QCC:
  - We must typecast objects to utilize their methods
DISCO:
	- There is a built in Comparable interface
	- The four requirements for a .equals() method are
  	- Reflexive: an objects equals itself
    - Symmetric: .equals() should return the same value for 2 objects regardless if it's a.equals(b) or b.equals(a)
    - Transitive: if a.equals(b) and b.equals(c), then a.equals(b);
    - Consistent: .equals() should not return differen values if the objects are not changed
	- throw new exception will return an error message, no return statment needed
  	- It will also stop the code from running at that point
*/


public class Rational implements Comparable{
	int numerator;
	int denominator;
	public Rational(){
		numerator=0;
		denominator=1;
	}
	public Rational(int n, int d){
		if (d==0){
			System.out.println("Error: Denominator is 0, value set to 0");
			numerator=0;
			denominator=1;
		} else{
			numerator=n;
			denominator=d;
		}
	}

	public String toString(){
		String output;
		output = numerator+"/"+denominator;
		return output;
	}

	public float floatValue(){
		return ((float) numerator)/(denominator);
	}

	public void multiply(Rational input){
		numerator = numerator*(input.numerator);
		denominator = denominator*(input.denominator);
	}

	public void divide(Rational input){
		if (input.numerator==0){
			System.out.println("Error: Cannot Divide, Input Numerator is 0");
		} else{
			numerator = numerator*(input.denominator);
			denominator = denominator*(input.numerator);
		}
	}

	public int gcd(){
    	if (numerator==0){
        return 0;
      }
			int n=Math.abs(numerator);
			int d=Math.abs(denominator);
		   while (n!=d){
		     if (n>d){
		       n=n-d;
		     } else {
		       d=d-n;
		     }
		   }
		   return d;
	  }
	// This is a basic gcd fxn, we will use it for other

	public void add(Rational input) {

    this.numerator=(this.numerator * input.denominator) + (input.numerator * this.denominator);
    // Adds them together
    this.denominator=this.denominator * input.denominator;

	}

 	public void subtract(Rational input) {

    this.numerator=(this.numerator * input.denominator) - (input.numerator * this.denominator);
    this.denominator=this.denominator * input.denominator;

	}

  public void reduce(){
    if (numerator==0){
        denominator = 1;
    } else {
        int gcd=this.gcd();
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
  }
// Updated compareTo so only rationals are accepted
  public int compareTo(Object o){
    if (o instanceof Rational){
    	Rational input = (Rational)o;
    	if (this.floatValue() > input.floatValue()) {
      		return 1;
    	}
    	else if (this.floatValue() < input.floatValue()) {
      		return -1;
   	 }
   	 else {
     		 return 0;
    	}
    } else{
    	throw new ClassCastException("\ncompareTo() input not a Rational");
    }

  }

// Updated equals so only rationals are accepted
  public boolean equals(Object other){
			if (other instanceof Rational){
				return (this.floatValue())==(((Rational)other).floatValue());
			}
			else {
				throw new ClassCastException("\nequals() input not a Rational");
			}
		}

	public static void main(String[] args){
    Rational a = new Rational(2,3);
		Rational b = new Rational(2,3);
		Rational c = new Rational(3,5);
    Rational d = new Rational(2,3);

    System.out.println("reflexive test");
    System.out.println(a.equals(a));

    System.out.println("symmetric test");
    System.out.println(a.equals(b));
    System.out.println(b.equals(a));

    System.out.println("different values");
		System.out.println(b.compareTo(c));

    System.out.println("error test");
		System.out.println(b.compareTo(1));
    System.out.println(b.equals(1));
	}
}
