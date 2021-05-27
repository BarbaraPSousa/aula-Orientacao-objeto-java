package bayTebank1;


//Class conta
public class Account {
	
	double balance;
	int agency;
	int number;
	String holder;
	
	
	//metodos
	public void deposit(double valor) {
		this.balance += valor;
	}
	
	public boolean draw(double valor){
		if(this.balance >= valor) {
			this.balance -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transferred(double value, Account sources) {
		if(this.balance >= value) {
			this.balance -= value;
			sources.deposit(value);
		}
		return false;
	}
}

	

