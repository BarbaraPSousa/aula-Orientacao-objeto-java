import java.util.Locale;	

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		char gender = 'F';
		

	
		System.out.println("Products:");
		System.out.printf("%s,which price is %f%n",product1, prince1);
		System.out.printf("%s,which price is %.2f%n",product2, prince2);
		System.out.println();
		System.out.printf("Record: %d years,code %d and gender:%c %n",age,code,gender);
		System.out.println();
		System.out.printf("Measue with eigh decimal pleces:%f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded (three decimal places): %.3f%n",measure);
		System.out.println();
		
		System.out.println("Traducao");
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Computador";
		int era = 30;
		int codigo = 5290;
		double valor1 = 2100.0;
		double valor2 = 650.50;
		double medida = 53.234567;
		char genero = 'F';
		
		System.out.println("Produtos:");
		System.out.printf("%s,cujo preço é: %f%n", produto1,valor1);
		System.out.printf("%s,cujo preço é:%f%n",produto2, valor2);
		System.out.println();
		System.out.printf("Registro: %d anos,código %d e gênero:%c%n", era,codigo,genero);
		System.out.println();
		System.out.printf("Medida com oito casa decimais: %f%n", medida);
		System.out.printf("Arredondando(tês casa decimais):%.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos Eua:%f%n", medida);
	}

}


