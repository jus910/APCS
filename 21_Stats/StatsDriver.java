/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred, Javier)
APCS
HW21: Stats
2021 10 20
QCC:
Disco:
*/
public class StatsDriver{
  public static void main(String[] args){
    Stats james = new Stats();

    System.out.println("Mean fxns, return 4.5");
    System.out.println(james.mean(3,6));
    System.out.println(james.mean(3.0,6.0));

    System.out.println("Max fxn, always return 6");
    System.out.println(james.max(3,6));
    System.out.println(james.max(6,3));
    System.out.println(james.max(6,3,3));
    System.out.println(james.max(3,6,3));
    System.out.println(james.max(3,3,6));
    System.out.println(james.max(6.0,3.0));
    System.out.println(james.max(3.0,6.0));
    System.out.println(james.max(6.0,3.0,3.0));
    System.out.println(james.max(3.0,6.0,3.0));
    System.out.println(james.max(3.0,3.0,6.0));

    System.out.println("Geo mean, should return 9 then 3");
    System.out.println(james.geoMean(3,27));
    System.out.println(james.geoMean(3.0,27.0));

    System.out.println(james.geoMean(3,3,3));
    System.out.println(james.geoMean(3.0,3.0,3.0));
  }
}
