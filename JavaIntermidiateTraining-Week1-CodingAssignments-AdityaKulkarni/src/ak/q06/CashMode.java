package ak.q06;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * cash is the payment mode
 * @author AK
 *
 */
public class CashMode implements Payments {
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * public constructor
	 */
	public CashMode() {
		LOGGER.log(Level.INFO, "Cash Mode selected......\n");
	}

	@Override
	public void payment(final Customer customer, final double amount) {
		LOGGER.log(Level.INFO, "Payment done:\n");
		generateReciept(amount);
		customer.setBalance(customer.getBalance() - amount);
		final String res = customer.toString();
		LOGGER.log(Level.INFO, "{0}",res);
	}

	@Override
	public void generateReciept(final double amountWithTaxes) {
		final String result = "Transaction id: " + (new Random().nextInt()) + "\n" +
				"Amount: " + amountWithTaxes + "\n";
		LOGGER.log(Level.INFO, result);
	}
}
