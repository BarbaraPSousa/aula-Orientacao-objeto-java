package entidade3;

public class Funcionario {

	
	public String nome;
	public double salarioGrosso;
	public double taxa;
	
	public double descontoImposto() {
		return salarioGrosso - taxa;
	}
	public void salarioComAlmento(double porcentagem) {
		salarioGrosso += salarioGrosso * porcentagem /100.00;
	}
	public String toString() {
		return nome + ", R$ " + String.format("%.2f",descontoImposto() );
	}
}
