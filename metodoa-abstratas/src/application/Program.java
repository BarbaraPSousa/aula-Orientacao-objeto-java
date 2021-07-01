package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>(); //Sempre fazer a lista da Super class
		
		System.out.print("Entrer the number or shapes:  ");
		int n = sc.nextInt();
		/*lendo as figuras digi por usuario*/
		for(int i = 1; i<=n; i++) {
			System.out.print("Shape # " + i + "date: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next()); 
			if (ch == 'r') {
				System.out.print("Whidt: ");
				double whidt = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, whidt, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println();
		System.out.println("SHAPER AREAS: ");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}			
		sc.close();
	}
}
