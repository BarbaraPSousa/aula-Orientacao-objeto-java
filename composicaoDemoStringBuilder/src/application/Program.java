/*Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
na tela do terminal, conforme exemplo.*/


package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
				
		/*Criando o OO*/
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), /*Hora do post*/
				"Traveling to new Zealand", /*ITitulo do post*/
				"I'm going to visit this wonderful country!", /*Comentario do post*/
				12); /*Likes*/
		
		/*adiconando os comentarios no post*/
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);						

	
	Comment c3 = new Comment("Good night");
	Comment c4 = new Comment("May the Force be with you");
	Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), /*Hora do post*/
			"Good night guys", /*ITitulo do post*/
			"See you tomorrowI'm going to visit this wonderful country!", /*Comentario do post*/
			5); /*Likes*/
	
	/*adiconando os comentarios no post*/
	p2.addComment(c3);
	p2.addComment(c4);
	
	System.out.println(p2);						
}

}
