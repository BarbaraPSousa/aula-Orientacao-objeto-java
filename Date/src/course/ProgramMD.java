package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramMD {

	public static void main(String[] args) {
		
		/*Manipulando data com Calendar*/
		
		/*Soamdno ou subitraindo unidade de tempo da data*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-06-04T17:36:03Z"));
				
		System.out.println(sdf.format(d));
		
		/*Acresentando horas*/
		
		/*OBJ*/  /*Variavel */	 /*Instancia*/
		Calendar cal =            Calendar.getInstance();
		cal.setTime(d);// agora ja tem um calendario com data instancidada dentro dele.
		cal.add(Calendar.HOUR_OF_DAY, 4); // para adicionar � so chamar a func��o ADD e passar os parametro
		d = cal.getTime(); // atualizar a varial com a data atualizada.		
		System.out.println(sdf.format(d));
		System.out.println("****************");
		
		/*Obtendo uma Unidade de tempo*/
	
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minute: " + minutes); // minitos
		int month = 1 + cal.get(Calendar.MONTH); // acresenta o 1+  porque o calendario conta iniciando do 0
		System.out.println("Month: " + month); // mes
	}
}
