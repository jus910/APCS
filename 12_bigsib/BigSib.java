/* <Justin> <Mohabir>
APCS
HW<12> -- <On Elder Individuality and the Elimination of Radio Fuzz/java_intro/helperclass>
<2021>-<10>-<06> */

// Static means that the method can only interact with objects inside of it. 

public class BigSib{

  String HelloMsg;

  public void SetHelloMsg(String InputMsg){
    HelloMsg=InputMsg;
  }

  public String greet(String Name){
    return HelloMsg+" "+Name;
  }

}
