package ak.q09;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * demo to show oops concept considering payment as example
 * @author AK
 *
 */
public final class MakePayments {
	
	/**
	 * private constructor
	 */
	private MakePayments() {
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Starting ......");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		Payments makePayments;
		
		makePayments = new CashMode();
		makePayments.payment(20.0);
		
		makePayments = new CreditCardMode("4857958685748523");
		makePayments.payment(45.0);
		
		makePayments = new UPIMode("4858745712");
		makePayments.payment(120.0);
	}

}
//OUTPUT

//Oct 11, 2020 10:16:28 PM ak.q09.CashMode <init>
//INFO: Cash Mode selected......
//
//Oct 11, 2020 10:16:28 PM ak.q09.CashMode payment
//INFO: Payment done:
//
//Oct 11, 2020 10:16:28 PM ak.q09.CashMode generateReciept
//INFO: Transaction id: 238521840
//Amount: 20.0
//
//Oct 11, 2020 10:16:28 PM ak.q09.CreditCardMode <init>
//INFO: Credit Card Mode selected......
//
//Oct 11, 2020 10:16:28 PM ak.q09.CreditCardMode payment
//INFO: Payment done:
//
//Oct 11, 2020 10:16:28 PM ak.q09.CreditCardMode generateReciept
//INFO: Transaction id: -97339203Credit Card number: 4857958685748523
//Amount: 47.25
//
//Oct 11, 2020 10:16:28 PM ak.q09.UPIMode <init>
//INFO: Credit Card Mode selected......
//
//Oct 11, 2020 10:16:28 PM ak.q09.UPIMode payment
//INFO: Payment done:
//
//Oct 11, 2020 10:16:28 PM ak.q09.UPIMode generateReciept
//INFO: Transaction id: 464704549Mobile number: 4858745712
//Amount: 122.4
//
