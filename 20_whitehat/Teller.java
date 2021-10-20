/* The Tator Tots (Humans: Daniel, Justin, Ari; Ducks: Ralph, Alfred, Javier)
APCS
HW20: External Audit
2021 10 19
QCC:
- What does it really mean to break an object? Does it involve run-time errors? 
Disco:
*/

public class Teller{
	public static void main( String[] args ) {
	
	// Test case
	BankAccount test = new BankAccount();
	test.setName("Tater Tots");
	test.setPasswd("Taters123456");
	test.setPin((short) 12345);
	test.AcctNum(123456789);
	test.setBalance(60000000.00);
	test.deposit(40000000.00);
	test.withdraw(10000000000000000);
	System.out.println(test.toString());

	// Breaking The Bank
	BankAccount test = new BankAccount();
	test.setName("Tater Tots");
	test.setPasswd("Taters123456");
	test.setPin((short) 12345);
	test.AcctNum(123456789);
	test.setBalance(600000000000000000000000000000000000000000000.00);
	test.deposit(400000000000000000000000000000);
	test.withdraw(10000000000000000000000000000000);
	System.out.println(test.toString());
	}
}
