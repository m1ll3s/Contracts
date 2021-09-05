package services;

public class PaypalService implements OnlinePaymentService {

	public static final double PAYMENT_FEE = 0.02;
	public static final double MOUNTHLY_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MOUNTHLY_INTEREST;
	}

}
