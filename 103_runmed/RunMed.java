/**
Team Cookie (Justin Mohabir, Lawrence Joa, Lior Polischouk)
APCS pd7
HW103 -- Erica's Friends, Hugo, and The One in the Middle
2022-05-18
time spent: 0.5 hrs
Disco:
 - The .set method in ArrayList returns the element previously at the specified position
 - The remove and add methods are O(log n) because we only need to traverse one branch
 QCC:
 - How are trees used?
 ALgo:

(the one from class)

a. if next val < root of maxheap, add to maxheap
   else add to minheap

b. balance heaps (so that size difference < 2)
   (remove from larger heap, add to smaller heap)

c. at any time find med by:
    a) heap sizes equal: med is mean of roots
    b) heap sizes !equal: med is root of larger heap
 */
import java.util.NoSuchElementException;
public class RunMed{
  ALHeapMax lilVals;
  ALHeapMin bigVals;

  public RunMed(){
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public double getMedian(){
    if (lilVals.isEmpty() && bigVals.isEmpty()){
      throw new NoSuchElementException("no elements found");
    } else if (lilVals.size() > bigVals.size()){
        return lilVals.peekMax() * 1.0;
      } else {
        return bigVals.peekMin() * 1.0;
      }
    }

  public void add(Integer newVal) {
    int lilValsSize=lilVals.size();
    int bigValsSize=bigVals.size();
    if (lilVals.isEmpty()){
      lilVals.add(newVal);
      return;
    } else if (newVal < lilVals.peekMax()){
      lilVals.add(newVal);
    } else{
      bigVals.add(newVal);
    }

    while(Math.abs(lilVals.size()-bigVals.size())>=2){
      if(lilVals.size() > bigVals.size()){
        bigVals.add(lilVals.removeMax());
      } else {
        lilVals.add(bigVals.removeMin());
      }
    }
  }
}
