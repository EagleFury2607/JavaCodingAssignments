package ak.q06;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * UPI is the payment mode
 * @author AK
 *
 */
public class UPIMode implements Payments {

	/**
	 * mobile number required for payment
	 */
	private String mobileNo;

	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * public constructor
	 * @param mobileNo
	 */
	public UPIMode(final String mobileNo) {
		super();
		LOGGER.log(Level.INFO, "Credit Card Mode selected......\n");
		this.mobileNo = mobileNo;
	}

	@Override
	public void payment(final Customer customer, final double amount) {
		LOGGER.log(Level.INFO, "Payment done:\n");
		final double amountWithTaxes = amount * 0.02 + amount;
		generateReciept(amountWithTaxes);
		customer.setBalance(customer.getBalance() - amount);
		final String res = customer.toString();
		LOGGER.log(Level.INFO, "{0}",res);
	}

	@Override
	public void generateReciept(final double amountWithTaxes) {
		final String result = "Transaction id: " + (new Random().nextInt()) +
				"Mobile number: " + this.mobileNo + "\n" + 
				"Amount: " + amountWithTaxes + "\n";
		LOGGER.log(Level.INFO, result);	
	}

}
