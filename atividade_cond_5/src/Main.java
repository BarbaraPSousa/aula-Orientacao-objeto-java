import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int item = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if(item ==1) {
			total = quantidade * 4.00;
		}
		else if(item == 2){
				total = quantidade * 4.50;	
			}
		else if(item == 3) {
			total = quantidade * 5.00;
		}
		else if(item == 4) {
			total = quantidade * 2.00;
		}
		else {
			total = item * 1.50;
		}
		System.out.println("Total = R$ " + total);
		
		
			sc.close();
		}
	}


