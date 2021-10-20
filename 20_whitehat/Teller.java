/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred, Javier)
APCS
HW20: External Audit
2021 10 19
QCC:
- What does it really mean to break an object? 
- Does it involve run-time or compile errors? 
- Should we focus on making the program trip us? 
Disco:
- Compile error when int is out of range (integer number too large)
- When placing zeroes in front of the deposit and withdraw int values, they don't seem to work correctly 
	- when we deposit 01000, the balance should be 1000, but is instead 512
	- when we deposit 001000, the balance is still 512
	- when we deposit 001101, the balance is 577
- WHen we place zeroes in front of the int value, java seems to read the numbers in base-8
*/

public class Teller{
	public static void main( String[] args ) {
	
	// Test case
	BankAccount test = new BankAccount();
	test.setName("Tater Tots");
	test.setPasswd("Taters123456");
	test.setPin((short) 1234);
	test.setAcctNum(123456789);
	test.setBalance(60000000.00);
	test.deposit(4000.00);
	test.withdraw(1000);
	System.out.println(test.toString());

	// Breaking The Bank
	BankAccount hack = new BankAccount();
	hack.setName("Tater Tots");
	hack.setPasswd("Taters123456");
	hack.setPin((short) 1234);
	hack.setAcctNum(100000002);
	hack.setBalance(0);
	hack.deposit(001101);
	hack.withdraw(0);
	System.out.println(hack.toString());

	// Breaking The Bank error
	/*
	BankAccount hack2 = new BankAccount();
	hack2.setName("Tater Tots");
	hack2.setPasswd("Taters123456");
	hack2.setPin((short) 1234);
	hack2.setAcctNum(123456789);
	hack2.setBalance(600000000000000000000000000000000000000000000.00);
	hack2.deposit(400000000000000000000000000000);
	hack2.withdraw(10000000000000000000000000000000);
	System.out.println(hack2.toString());
	*/
	}
}
