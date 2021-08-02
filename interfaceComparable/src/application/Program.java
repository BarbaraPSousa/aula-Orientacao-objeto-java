/*Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();//inst list de funcionarios
		String path = "C:\\Users\\BARBARA\\Desktop\\Curso Javas\\int.txt";//caminho do arquivo
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){//intancia de Buff para ler arquivo
			
			String employeeCsv = br.readLine();//lendo o arquivo
			while(employeeCsv != null) {//diferente de null
				String[] fields = employeeCsv.split(",");///criando verct p/ q cada posicao do vetor seja um campo e conseguimos recorta a string
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));//add na list com recorte de string
				employeeCsv = br.readLine();//lendo novamente
			}
			Collections.sort(list);//opracao padra, para ordena coleção
			for(Employee emp : list) {//percorre a lista
				System.out.println(emp.getName() +", " + emp.getSalary());//imprim elemento
			}
		}
		catch (IOException e) {//tratamento de exceção
		System.out.println("Erro: " + e.getMessage());
		}			
	}
}
