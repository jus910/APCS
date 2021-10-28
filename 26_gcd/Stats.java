/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred, Javier)
APCS
HW26: GCD Three Ways
2021 10 20
QCC:
Disco:
  - It helps to draw out the recursion to uderstand it.
  - If we want a method with return statements in the "if" or "else if" clauses to compile we either need a
    return statement outside the conditional or an else statement with a conditional
Time Spent: 0.5 hrs
*/

public class Stats {

  public static int mean(int a, int b) {
    return (a+b)/2;
  }

  public static double mean(double a, double b) {
    return (a+b)/2;
  }

  public static int max(int a, int b) {
    if (a>b){
      return a;
    }
    return b;
  }

  public static double max(double a, double b) {
    if (a>b){
      return a;
    }
    return b;
  }

  public static int geoMean(int a, int b) {
    double a2=a*1.0;
    double b2=b*1.0;
    return Math.round(Math.round(Math.pow((a2*b2),0.5)));
  }

  public static double geoMean(double a, double b) {
    return Math.round(Math.round(Math.pow((a*b),0.5)));
  }

  public static int max(int a, int b, int c) {
    if (a>b && a>c){
      return a;
    } else if (b>a && b>c){
      return b;
    }
    return c;
  }

  public static double max(double a, double b, double c) {
    if (a>b && a>c){
      return a;
    } else if (b>a && b>c){
      return b;
    }
    return c;
  }

  public static int geoMean(int a, int b, int c) {
    return(Math.round(Math.round(Math.pow((a * b * c), (0.333333333)))));
  }

  public static double geoMean(double a, double b, double c) {
    return(Math.round(Math.pow((a * b * c), (0.333333333))));
  }

  public static int gcd(int a, int b){
    int loop;
    if (a<b){
      loop=a;
    } else {
      loop=b;
    }
    while(((a%loop)!=0)||((b%loop)!=0)){
      loop=loop-1;
    }
    return loop;
  }

  public static int gcdER(int a, int b){
    if (b>a){
      return gcdER(b-a,a);
    } else if (a>b){
      return gcdER(a-b,b);
    } else {
      return a;
    }
  }

  public static int gcdEW(int a, int b){
    int loop;
    while (a!=b){
      if (a>b){
        a=a-b;
      } else {
        b=b-a;
      }
    }
    return a;
  }

  //main method for testing functionality
  public static void main( String[] args ) {
    System.out.println("gcd");
    System.out.println(gcd(9,14));
    System.out.println(gcd(18,15));
    System.out.println(gcd(5,5));

    System.out.println("gcdEW");
    System.out.println(gcdEW(9,14));
    System.out.println(gcdEW(18,15));
    System.out.println(gcdEW(5,5));

    System.out.println("gcdER");
    System.out.println(gcdER(9,14));
    System.out.println(gcdER(18,15));
    System.out.println(gcdER(5,5));
  }

}//end class
