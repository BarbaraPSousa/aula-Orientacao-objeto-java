package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");/*Declaramos uma contatnte com o formato da data para não ficar instancianado todas as veses que precisar usar, o private static é para não temos uma copia de cada aplicação do post e fica apenas 1 para aplicação inteira*/
	
	private Date monment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>(); /*associação da lista Comments*/ 
	
	public Post() {		
	}

	public Post(Date monment, String title, String content, Integer likes) {
		this.monment = monment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMonment() {
		return monment;
	}

	public void setMonment(Date monment) {
		this.monment = monment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	/*no lugar do set fazemos a função add e remove da lista*/ 
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	/*criando o StringBuilder*/
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); /*Declarando o StringB*/ 
		
		sb.append(title + "\n");/*função apende significa acresenta no final */ 
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(monment )+ "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c : comments) { /*para cada comentario  na lista de comentario do post acresente o coemtario c no stringB*/
			sb.append(c.getText() + "\n");
		}
		return sb.toString(); /*Converte o sb para toStr*/
	}
}
