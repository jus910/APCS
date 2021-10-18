/* <Justin> <Mohabir>
APCS
HW<18> -- <CPA-One/java_intro/bigclass>
<2021>-<10>-<18>
QCC: Are my discos are correct?
Disco: We can create an instance of a class within a class
Team Tator Tot's Latest and Greatest Q2 Response: If you try to put parameters into a new object when it
does not have a constructor it returns the error "error: constructor BankAccount in class BankAccount
cannot be applied to given types;". This means there must be a constructor before we make one.

Team Tator Tot's Latest and Greatest Q2 Response: If you try to put parameters into a new object when it
does not have a constructor it returns the error "error: constructor BankAccount in class BankAccount
cannot be applied to given types;". This means there must be a constructor before we make one.

Team Tator Tot's Latest and Greatest Q3 Response: Print the object, System.out.println(ObjectName)
*/

public class BankAccount{
  String Name;
  String Password;
  int PIN;
  int AccountNumber;
  double Balance;

/*These are contructors, one has no input, other has all inputs necessary*/

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
		System.out.println("Name:"+ Name);
    System.out.println("Password:"+Password);
    System.out.println("Pin:"+PIN);
    System.out.println("AccountNumber:"+AccountNumber);
    System.out.println("Balance:"+Balance);
  }

  public void withdraw(int WithdrawAmount){
    Balance=Balance-WithdrawAmount;
  }

  public void deposit(int DepositAmount){
    Balance=Balance+DepositAmount;
  }

/*This is main method*/
  public static void main(String[] args){
    BankAccount olu = new BankAccount("bean","bean",0000,0000);
    System.out.println(olu);
    System.out.println("Below is the info from constructor");
    olu.PrintInfo();
    System.out.println("Below is the info from new stuffs set");
    olu.SetName("james");
    olu.SetPassword("james2");
    olu.SetPIN(1234);
    olu.SetAccountNumber(1235);
    olu.withdraw(5);
    olu.deposit(10);
    olu.PrintInfo();
  }
}
