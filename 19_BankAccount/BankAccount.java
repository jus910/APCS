/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred)
APCS
HW 19 -- Mo Money Mo Problems ...MORE AWESOME
2021 10 18

QCC:
Disco:
*/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------

  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    if (newPin>=1000 && newPin<=9998){
      short oldPin = pin;
      pin = newPin;
      return oldPin;
    }
    short oldPin = pin;
    pin = 9999;
    System.out.println("Your PinNumber is not in range");
    return oldPin;

  }

  public int setAcctNum( int newAcctNum ) {
    if (newAcctNum>=100000000 && newAcctNum<=999999998){
      int oldAcctNum = acctNum;
      acctNum = newAcctNum;
      return oldAcctNum;
    }
    int oldAcctNum = acctNum;
    System.out.println("Your AccountNumber is not in range");
    acctNum = 999999999;
    return oldAcctNum;

  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if (withdrawAmount>balance){
      System.out.println("You do not have enough money");
      return false;
    }

    balance=balance-withdrawAmount;
    return true;
  }

  public boolean authenticate(int accountNumberInput, String passwordInput){
    if (accountNumberInput==acctNum && passwordInput==passwd){
      System.out.println("Authenticated!!!");
      return true;
    }
    System.out.println("Not Authenticated");
    return false;
  }


  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
    BankAccount ba = new BankAccount();

    System.out.println(ba.toString());

    ba.setName("tater");
    ba.setPasswd("ABC123");
    ba.authenticate(11,"aj");
    short test = 123;
    ba.setPin(test);
    ba.setAcctNum(575757);
    ba.withdraw(500000);
    System.out.println(ba.toString());

    test=1234;
    ba.setPin(test);
    ba.setAcctNum(111111111);
    ba.authenticate(111111111,"ABC123");
    ba.setBalance(80000);
    ba.deposit(20000);
    ba.withdraw(50000);
    System.out.println(ba.toString());
  }//end main()

}//end class BankAccount
