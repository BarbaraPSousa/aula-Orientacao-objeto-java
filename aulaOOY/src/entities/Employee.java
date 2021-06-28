package entities;

public class Employee {
	
	public String name;
	public Double  valorPorHora;
	public Integer horas;

	
	public double total() {
		return valorPorHora* horas;
	}
	  
	
}
