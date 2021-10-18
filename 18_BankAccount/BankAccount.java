/* <Justin> <Mohabir>
APCS
HW<18> -- <CPA-One/java_intro/helperclass>
<2021>-<10>-<18>
QCC: Are my discos are correct?
Disco: We can create an instance of a class within a class
  */

public class BankAccount{
  String Name;
  String Password;
  int PIN;
  int AccountNumber;
  double Balance;

/*These are contructors, one has no input, other has all inouts necessary*/

  public BankAccount(String NameInput,String PassInput,int PINInput,int AccountNumberInput){
    Name = NameInput;
    Password = PassInput;
    PIN = PINInput;
    AccountNumber = AccountNumberInput;
  }

  public BankAccount(){ }

/*These are methods*/
  public void SetName(String NameInput){
		Name = NameInput;
  }

  public void SetPassword(String PassInput){
		Password = PassInput;
  }

  public void SetPIN(int PINInput){
		PIN = PINInput;
  }

  public void SetAccountNumber(int AccountNumberInput){
		AccountNumber = AccountNumberInput;
  }

  public void PrintInfo(){
		System.out.println(Name);
    System.out.println(Password);
    System.out.println(PIN);
    System.out.println(AccountNumber);
    System.out.println(Balance);
  }
  
/*This is main method*/
  public static void main(String[] args){
    BankAccount olu = new BankAccount("bean","bean",0000,0000);
    System.out.println("Below is the info from constructor");
    olu.PrintInfo();
    System.out.println("Below is the info from new stuffs set");
    olu.SetName("james");
    olu.SetPIN(1234);
    olu.PrintInfo();

  }
}
