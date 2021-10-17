/* <Justin> <Mohabir>
APCS
HW<18> -- <CPA-One/java_intro/helperclass>
<2021>-<10>-<18>
QCC: Are my discos are correct?
Disco:
  */

public class BankAccount{
  String Name;
	String Password;
	int PIN;
	int AccountNumber;
	double Balance;

	public void SetName(String NameInput){
		Name = NameInput;
  }

  public void SetPassword(String PassInput){
		Password = PassInput;
  }

  public void SetPIN(int InputPIN){
		PIN = InputPIN;
  }

  public static void main(String[] args){
    BankAccount olu = new BankAccount();
    olu.SetName("james");
    System.out.println(olu.Name);
  }
}
