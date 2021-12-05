// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW42 -- Be More Rational
// 2021-12-5
// Time spent: 1 hours

/*
QCC:
  - Is it possible to change the basic operators like +,/,-,* to work with Rational (Or any class)?
  - When working with division we always have to account for 0
DISCO:
	-
*/


public class Rational{
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
  public int compareTo(Rational input){
    /*
    Rational ours = new Rational(numerator,denominator);
    Rational theirs = new Rational(input.numerator,input.denominator);
    ours.subtract(theirs);

    if (ours.numerator > 0 ) {
      return 1;
    }
    if (ours.numerator < 0 ) {
      return -1;
    }
    else return 0;
    */
    if (this.floatValue() > input.floatValue()) {
      return 1;
    }
    else if (this.floatValue() < input.floatValue()) {
      return -1;
    }
    else {
      return 0;
    }
  }

	public static void main(String[] args){
	/*
		Rational a = new Rational();
		System.out.println("a value before: "+a);
		System.out.println("a float value before: "+a.floatValue() + "\n");
		Rational b = new Rational(2,3);
		System.out.println("b value before: "+b);
		System.out.println("b float value before: "+b.floatValue() + "\n");
		b.multiply(a);
		System.out.println("b value after: "+b);
		System.out.println("a value after: "+a + "\n");
		b.divide(a);
		Rational c = new Rational(3,5);
		Rational d = new Rational(6,10);
		System.out.println("c value before: "+c);
		System.out.println("d value before: "+d + "\n");
		c.divide(d);
		System.out.println("c value after division: "+c);
		System.out.println("d value after division: "+d + "\n");
		Rational e = new Rational(2,0);
		System.out.println(e);
		System.out.println(e.floatValue());
	*/
		Rational b = new Rational(36,24);
		Rational a = new Rational(36,24);
		System.out.println(b.compareTo(a));
		b.subtract(a);
		System.out.println(b.gcd());

    Rational c = new Rational(-4, 8);
    System.out.println(c.gcd());
    c.reduce();
    System.out.println(c);
	}
}
