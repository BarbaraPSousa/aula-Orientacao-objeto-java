   /*Declando class Abstrada*/

package entities;

public abstract class Account { /*A inclu. da palavra abritada no inicio */

	private Integer number;
	private String holde;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holde, Double balance) {
		this.number = number;
		this.holde = holde;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolde() {
		return holde;
	}

	public void setHolde(String holde) {
		this.holde = holde;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.00;
		
	}
	public void deposit(double amount) {
		balance += amount;
	}

}
