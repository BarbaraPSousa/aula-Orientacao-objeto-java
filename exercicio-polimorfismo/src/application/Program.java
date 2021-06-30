package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		/* LENDO CONTIDADE DE FUNCIONARIOS */
		System.out.print("Enter the number or employees: ");
		int n = sc.nextInt();
		/* LENDO LISTA */
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " Date:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value por hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') { // lendo se o funcionario por tercerizado
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Intanciando a sub Class para ler quando o funcionario é ter.
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)); // adicionando a lista
			} else 
				list.add(new Employee(name, hours, valuePerHour));			
		}
		/* Mostrando a listagem */
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - " + String.format("%.2f", emp.paymente()));

			sc.close();
		}
	}
}


