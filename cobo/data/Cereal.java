// Team Melon :: Justin Mohabir, Jomin Zhang
public class Cereal{
    String name;
    String type;
    int cal;
    int pro;
    int fat;
    int sod;
    int fib;
    int car;
    int sug;
    int pot;
    int vit;
    int she;
    int wei;
    int cup;
    int rating;
    public Cereal(String name1, String type1, int cal1, int pro1, int fat1, int sod1, int fib1, int car1, int sug1, int pot1, int vit1, int she1, int wei1, int cup1, int rating1){
        name = name1;
        type = type1;
        cal = cal1;
        pro = pro1;
        fat = fat1;
        sod = sod1;
        fib = fib1;
        car = car1;
        sug = sug1;
        pot = pot1;
        vit = vit1;
        she = she1;
        wei = wei1;
        cup = cup1;
        rating = rating1;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String s = "";
        s += this.getName();
        return s;
    }
    public static void main (String[] args){
        Cereal Clusters = new Cereal("Clusters", "C", 110, 3,2,140,2,13,7,105,25,3,1,1,40);
        System.out.println(Clusters);
    }
}
