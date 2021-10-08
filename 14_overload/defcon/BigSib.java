/* <Justin> <Mohabir>
APCS
HW<14> -- <Customize Your Creation/java_intro/helperclass>
<2021>-<10>-<08>
QCC: Are my discos are correct?
Disco:
  In order to overload the constructor we must have two constructors, that differ in parameters.
  This allows both Greet files to use this code, because if one constructor does not work it uses the other
  */

public class BigSib{
  String HelloMsg;

  public BigSib(){
    HelloMsg="Word Up";
  }

  public BigSib(String InputMsg){
    HelloMsg=InputMsg;
  }

  public String greet(String Name){
    return HelloMsg+" "+Name;
  }

}
