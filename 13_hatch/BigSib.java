/* <Justin> <Mohabir>
APCS
HW<13> -- <Where do BigSibs Come From?/java_intro/helperclass>
<2021>-<10>-<07>
QCC: Are my discos are correct?
Disco:
  We need to initialize global vars outside of any method before we can use them.
  The constructor returns no value*/

public class BigSib{
  String HelloMsg;

  public BigSib(String InputMsg){
    HelloMsg=InputMsg;
  }

  public String greet(String Name){
    return HelloMsg+" "+Name;
  }

}
