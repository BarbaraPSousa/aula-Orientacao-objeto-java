package entities;

public class Employee implements Comparable<Employee> {//implmenta a class de comparação
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {//implementando o metodo comparable, passando a informaçãod e como deve ser feito a comparação de OO
		//return name.compareTo(other.getName());//comparação de 2 funcionario por nome
		//return salary.compareTo(other.getSalary());// comparando 2 funcionariao pelo salario em ordem cresente
		return - salary.compareTo(other.getSalary());// comparando 2 funcionariao pelo salario em ordem decresente
	}
}
