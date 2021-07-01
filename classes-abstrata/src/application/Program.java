package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		/* INTANCIANDO CLASS OBSTRATAS */

		/*
		 * Account acc1 = new Account(1001, "alex", 1000.00); NÃO PODE SER INSTANCIADO
		 * POIS FOI PASSADO NA CLASS O A DECLARAÇÃO DE ABSTRATO
		 */
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		Account acc3 = new BussinessAccount(1003, "Bob", 100.00, 500.00);

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex",500.00, 0.01));	
		list.add(new BussinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BussinessAccount(1005, "Anna", 500.0, 500.0));
	
		//Soma de todas as contas
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		
		//Adcionando valor de em todas as contas
		System.out.println("Deposito");
		for(Account acc : list) {
			acc.deposit(10.00);
			System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
		}
	}
}