package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	

	/*private PaypalService paymentService = new PaypalService(); não utilizamos desta forma, pois cria um alto acoplamento de servicos, e se no possivel for necessario altera alguma depedencia não podemos mudar a class.Principo class aberta para isntenção, mas naõ para alteração*/

	private OnlinePaymentService OnlinePaymenService;//declarar a varialvel com o tipo da interface
	
	
	public ContractService(OnlinePaymentService OnlinePaymenService) {//injetando a depedencia 
		this.OnlinePaymenService = OnlinePaymenService;
	}
	
	public void processContract(Contract contract, int months) {//resp por instanciar os OO que vai ser as parcelas
		
		double basicQuota = contract.getTotalValue()/ months;//calculo de valor armotizado 	
		
		for(int i = 1; i<= months; i++) {//processa a contidade de parcelas
			double updatedQuota = basicQuota + OnlinePaymenService.interest(basicQuota, i);//implementando o valor da parcela com juros
			double fullQuota = updatedQuota + OnlinePaymenService.paymentFee(updatedQuota);//implementando o valor atualizado com juros e acresentando a tax de pagamento
			Date doueDate = addMonths(contract.getData(), i);//data de vencimento das parcelas
			
			contract.getInstallments().add(new Installment(doueDate, fullQuota));//instanciando o contrato e add na lista
			
		}				
	}
	
	private Date addMonths(Date data,int N) {//função auxiliar para acresenta meses a uma data
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);//calandario instanciado
		calendar.add(calendar.MONTH, N);
		return calendar.getTime();
		
		
		
	}
	
	
	
}
