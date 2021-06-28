package entidade2;

public class Fincionario {
	
	 public String nome;
	 public double salario;
	 public double imposto;
	 
	 public double salarioComImposto() {
		 return salario - imposto;
	 }
	 public void salarioComAlmento(double porcentagem) {
		  salario += salario * porcentagem / 100;
		 
	 }
	 public String toString() {
		 return  nome  + ". R$ " +String.format("%.2f", salarioComImposto());
	 }
	 

}
