package bayTebank1;

public class CreatingAccount {

	public static void main(String[] args) {

		// Primeira instancia
		Account firstAccount = new Account();// aponta uma referencia

		firstAccount.balance = 200;// informando valores de um atributo

		System.out.println(firstAccount.balance);// acesso de um tributo oaum OO
		firstAccount.balance += 100;
		System.out.println(firstAccount.balance);// como Obj ja tem o valor de 200, ao chamar a função balance + 100,vai somar

		// Segunda instancia
		Account secondAccount = new Account(); // criando segunda conta
		secondAccount.balance = 300;// informando o valor do novo atributo

		// diferencas de Obj intanciados
		System.out.println("Balance Firs: " + firstAccount.balance);
		System.out.println("Balance second: " + secondAccount.balance);

		// Valores default de atributos
		secondAccount.agency = 146;
		System.out.println(firstAccount.agency);
		System.out.println(firstAccount.number);

		System.out.println(secondAccount.agency);
	}
}
