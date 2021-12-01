// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW41 -- Be Rational
// 2021-11-30
// Time spent: .3 hours

/*
QCC:
	- Is it possible to change the basic operators like +,/,-,* to work with Rational (Or any class)?
DISCO:
	- We only need to typecast one int into a float for the operation to become a float operation
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

	public static void main(String[] args){
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
	}
}
