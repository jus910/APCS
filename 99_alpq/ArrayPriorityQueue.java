import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    ArrayList<Integer> priorityQ;
    public ArrayPriorityQueue(){
      priorityQ = new ArrayList<Integer>();
    }
    public void add(int x){
      if(isEmpty() || x<peekMin()){
        priorityQ.add(x);
        return;
      }
      int i=0;
      while(x<priorityQ.get(i)){
        i++;
      }
      priorityQ.add(i, x);
    }

    public boolean isEmpty(){
      return priorityQ.size()==0;
    }

    public int peekMin(){
      return priorityQ.get(priorityQ.size()-1);
    }

    public int removeMin(){
      int i = peekMin();
      priorityQ.remove(priorityQ.size()-1);
      return i;
    }

    public String toString(){
      String hi = "";
      for(int i=0; i<priorityQ.size()-1; i++){
        hi+=priorityQ.get(i) + ",";
      }
      hi+=peekMin();
      return hi;
    }

    public static void main(String[] args) {
      ArrayPriorityQueue poo = new ArrayPriorityQueue();
      poo.add(5);
      poo.add(3);
      poo.add(4);
      poo.add(7);
      poo.add(8);
      poo.add(1);
      System.out.println("poo: "+  poo);

      System.out.println();
      System.out.println("min: " + poo.peekMin());
      System.out.println("removeMin: " + poo.removeMin());
      System.out.println("min: " + poo.peekMin());
      System.out.println("removeMin: " + poo.removeMin());
      System.out.println("min: " + poo.peekMin());
      System.out.println("removeMin: " + poo.removeMin());

      System.out.println();
      System.out.println("poo: "+  poo);
    }
}
