/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).*/

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); /*Formatação de leitura de Data*/
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workername = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salary: ");
		double workerSalary = sc.nextDouble();
		/*Intanciadondo trabalhador*/
								/*nome usu.*/  /*int. da enum/   /*nivel usu.*/  /*Salrio usu.*/      /*OO Dp.*/    /*Dep usu.*/
		Worker worker = new Worker(workername, WorkerLevel.valueOf(workerLevel), workerSalary,    new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt(); /*Insirino contidade de contrato a ser lidos*/ 
		
		for(int i = 1; i <= n; i ++) { /*Ler os dados do contrato*/ 
			System.out.println("Enter contract #" + i + " data: ");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next()); /*lendo a data com o formado (dd/MM/YYYY) com perseforme, criado no incio */ 
			
			System.out.print("Value per hour: ");
			double valuerPerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			/*Intanciando o contrato para uso das veriavel*/
			
			HourContract contract = new HourContract(contractDate, valuerPerHour, hours) ;
			worker.addContract(contract); /*para associar o contrato com o trabalhador chamaos o metos add*/ 
		}
		
		System.out.println();
		System.out.print("enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		/*Recortando String*/ 
		int month = Integer.parseInt(monthAndYear.substring(0,2)); /*utilizando na posição 0 que é o inicio e 2 que é o final, sempre usar 1 casa a mas */ 
		int year = Integer.parseInt(monthAndYear.substring(3));/*Recortando apenas a posição 3, já indica que é tudo*/ 
		
		System.out.println("name: " + worker.getName() );
		System.out.println("Department: " + worker.getDepartmante().getName());		
		System.out.println("Income For: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		
		
		
		sc.close();

	}

}
