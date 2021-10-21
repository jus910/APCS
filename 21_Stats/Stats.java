/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred, Javier)
APCS
HW21: Stats
2021 10 20
QCC:
Disco:
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


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class
