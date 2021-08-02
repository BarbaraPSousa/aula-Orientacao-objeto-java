package model.services;

public class PaypalService implements OnlinePaymentService {//class implementa interf.

  private static final double PAYMENT_FEE = 0.02;
  private static final double MONTHLY_INTEREST = 0.01;

	@Override
	public double paymentFee(double amount) {//calculo de taxa  pag de  com base no contrato de interf.
		return amount * PAYMENT_FEE;
	}
	
	@Override
	public double interest(double amount, int months) {//calculo de juros simple com base no contrato de interf.
		return amount * MONTHLY_INTEREST * months;
	}
}
