import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		in fat = 1;
		
		for(int i = 0; i< N; i++) {
			
			fat = fat * i;
		}
		System.out.println(fat);
		
		
		
		
		sc.close();

	}

}
