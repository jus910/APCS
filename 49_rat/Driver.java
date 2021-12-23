// Team we forgot: Justin Mohabir, Jonathan Song, Kevin Li
// APCS pd8
// HW49: Rational Standards Compliance
// 2021-12-22
// Time spent: 1 hours

public class Driver{
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
      System.out.println(c.equals(b));

      System.out.println("error test");
		  System.out.println(b.compareTo(1));
      System.out.println(b.equals(1));
    }
}
