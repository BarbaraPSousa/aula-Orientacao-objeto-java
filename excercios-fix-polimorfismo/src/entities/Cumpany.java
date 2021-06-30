package entities;

public class Cumpany extends TaxPayer{
		
	private  Integer numberOfEmployees;
	
	public Cumpany() {
		super();
	}

	public Cumpany(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return getAnualIncome() * 1.4;
		}
		else {
			return getAnualIncome() * 1.6;
		}
	}

}
