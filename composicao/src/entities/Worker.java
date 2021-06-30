/*Criando Composição de OO*/

package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	/*Atributos basicos*/
	
	
	private String name;
	private WorkerLevel leval; /*chama a clase */ 
	private Double baseSalary;
	
	/*Associação*/ /*informa que Worke tem varias depamento*/
	
	private Department departmante; /*OO departamento*/
	private List<HourContract> contracts = new ArrayList<>();/*1ª Estanciar a lista por padrão na clase, utilizando "New"*/ /*2º como o dp worker tem varios contratos, representamos com uma lista*/ 

	public Worker() {		
	}

	public Worker(String name, WorkerLevel leval, Double baseSalary, Department departmante) {
		this.name = name;
		this.leval = leval;
		this.baseSalary = baseSalary;
		this.departmante = departmante;
		/*não coloca lista do Contruto quando tiver uma composição tem muitos e estanciar na classe, inicia a lista vazia*/
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLeval() {
		return leval;
	}

	public void setLeval(WorkerLevel leval) {
		this.leval = leval;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartmante() {
		return departmante;
	}

	public void setDepartmante(Department departmante) {
		this.departmante = departmante;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

/*	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
		NÃO PODE DEIXA ESTA O SET DO CONTRATO para não ser trocada a lista, POIS O CONTRATO SÓ PODE SER ALTERADO PELO METODOS CRIADO ABAIXO E NUNCA MANUALMENTE
	}*/
	
	/*Implementando metodos*/		
	
	public void addContract(HourContract contract) { // vai pega a lista contrac e adicionar  o contrato que ficou como argumento no parentes.
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) { // vai remover o contrato da lista do trabalhado
		contracts.remove(contract);
	}

						   /*Ano*/	   /*mes*/
	public double income(int  year, int month) { /*Calculando quanto a pessoa ganha paseado no ano e mes*/ 
		double sum = baseSalary; // soma recebe o salario base
		
		Calendar cal = Calendar.getInstance(); /*utilzando o calendder*/ 
	
		for(HourContract c : contracts) { /*for para roda a lista de contrato e saber o valor que recebe no mes.*/			
			cal.setTime(c.getDate()); /*utilizamos a data do contratoo e defiminos como data do calendario*/
			
			int c_year = cal.get(Calendar.YEAR); /*recabe o Ano do contrato c*/
			int c_month = 1 + cal.get(Calendar.MONTH); /*recabe o Mes do contrato c*/
			if(year == c_year && month == c_month) { /*se o ano é igual o ano do contrato que esta analisando Ou se mes é igual o mes do contrato que estou analisando*/
				sum += c.totalValue(); /*valor entra na soma*/
			}			
		}
		return sum;			
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
