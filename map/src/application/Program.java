package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();//inciciando com Strinh
		
		cookies.put("userName", "Maria");// guardadno o valor nome e Maria
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711111");
		
		cookies.remove("email");// excuir o email
		cookies.put("phone", "97863333");//não admite repetição de chave, sobre escreve 
	
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));// verificando se exixte a chave phone
		System.out.println("Phone number: " + cookies.get("phone"));//pegando o valor apenas
		System.out.println("Email: " + cookies.get("email"));//verificando se tem item nalista de pois de removido
		System.out.println("Size: " + cookies.size());//verificadno o tamanho
		
		
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {//pecorrendo o conjunto chamando cada elemento de key
			System.out.println(key + ": " + cookies.get(key));//imptimindo
			
		}

	}

}
