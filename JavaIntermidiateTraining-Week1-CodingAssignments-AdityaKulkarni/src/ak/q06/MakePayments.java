package ak.q06;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * make paymnets for customer by taking inputs
 * @author AK
 *
 */
public final class MakePayments {
	
	private MakePayments() {
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Starting.....");
	}
	
	/**
	 * main function
	 * @param args
	 */
	public static void main(final String[] args) {
		final Customer customer = new Customer(2_546_153, "AK", 3000);
		
		Payments makePayments;
		
		makePayments = new CashMode();
		makePayments.payment(customer, 20.0);
		
		makePayments = new CreditCardMode("4857958685748523");
		makePayments.payment(customer, 45.0);
		
		makePayments = new UPIMode("4851257856");
		makePayments.payment(customer, 98.256);
		
	}
}
//Output
//
//Oct 11, 2020 11:05:53 PM ak.q06.CashMode <init>
//INFO: Cash Mode selected......
//
//Oct 11, 2020 11:05:53 PM ak.q06.CashMode payment
//INFO: Payment done:
//
//Oct 11, 2020 11:05:53 PM ak.q06.CashMode generateReciept
//INFO: Transaction id: 275686293
//Amount: 20.0
//
//Oct 11, 2020 11:05:53 PM ak.q06.CashMode payment
//INFO: Customer [accountId=2546153, name=AK, balance=2980.0]
//Oct 11, 2020 11:05:53 PM ak.q06.CreditCardMode <init>
//INFO: Credit Card Mode selected......
//
//Oct 11, 2020 11:05:53 PM ak.q06.CreditCardMode payment
//INFO: Payment done:
//
//Oct 11, 2020 11:05:53 PM ak.q06.CreditCardMode generateReciept
//INFO: Transaction id: 172127978Credit Card number: 4857958685748523
//Amount: 47.25
//
//Oct 11, 2020 11:05:53 PM ak.q06.CreditCardMode payment
//INFO: Customer [accountId=2546153, name=AK, balance=2935.0]
//Oct 11, 2020 11:05:53 PM ak.q06.UPIMode <init>
//INFO: Credit Card Mode selected......
//
//Oct 11, 2020 11:05:53 PM ak.q06.UPIMode payment
//INFO: Payment done:
//
//Oct 11, 2020 11:05:53 PM ak.q06.UPIMode generateReciept
//INFO: Transaction id: 543876672Mobile number: 4851257856
//Amount: 100.22112
//
//Oct 11, 2020 11:05:53 PM ak.q06.UPIMode payment
//INFO: Customer [accountId=2546153, name=AK, balance=2836.744]
