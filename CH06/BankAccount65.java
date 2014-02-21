/* Project 6-5
 *
 * BankAccount Class holds an owner's name
 * and their balance.
 *
 */

public class BankAccount65 {
	private String name;
	private double balance;

	public BankAccount65() {
		name = "";
		balance = 0;
	}

	public void setName(String nm) {
		name = nm;
	}

	public String getName() {
		return name;
	}

	public void deposit(double Money) {
		balance += Money;
	}

	public void withdraw(double Money) {
		balance -= Money;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		String str;
		str = "Name:    " + name + "\n" +
		      "Balance: " + getBalance();
		return str;
	}
}
