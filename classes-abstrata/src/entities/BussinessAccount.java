package entities;

public class BussinessAccount extends Account{
	
	private Double loanLimit;
	
	public BussinessAccount() {
		super();
	}

	public BussinessAccount(Integer number, String holde, Double balance, Double loanLimit) {
		super(number, holde, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount -10.00;
		}
	}
}
