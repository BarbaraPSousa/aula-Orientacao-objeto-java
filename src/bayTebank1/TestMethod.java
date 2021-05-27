package bayTebank1;

public class TestMethod {

	public static void main(String[] args) {
		
		Account accountDoPaulo = new Account();
		accountDoPaulo.balance = 100;
		accountDoPaulo.deposit(50);//chamando o metodo e informando valores
		
		System.out.println(accountDoPaulo.balance);
		
		boolean conseguiuRetirar = accountDoPaulo.draw(20);
		System.out.println(accountDoPaulo.balance);
		System.out.println(conseguiuRetirar);
		
		Account accountMaria = new Account();
		accountMaria.deposit(1000);
		
		accountMaria.transferred(300, accountDoPaulo);
		System.out.println(accountMaria.balance);
		System.out.println(accountDoPaulo.balance);
	}
}
