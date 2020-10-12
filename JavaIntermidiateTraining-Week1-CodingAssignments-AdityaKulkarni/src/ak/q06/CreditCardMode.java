package ak.q06;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Credit card is payment mode
 * @author AK
 *
 */
public class CreditCardMode implements Payments {
	
	/**
	 * credit card number taken as input
	 */
	private final String creditCardNo;

	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * public constructor
	 * @param creditCardNo
	 */
	public CreditCardMode(final String creditCardNo) {
		super();
		LOGGER.log(Level.INFO, "Credit Card Mode selected......\n");
		this.creditCardNo = creditCardNo;
	}

	@Override
	public void payment(final Customer customer, final double amount) {
		LOGGER.log(Level.INFO, "Payment done:\n");
		final double amountWithTaxes = amount * 0.05 + amount;
		generateReciept(amountWithTaxes);
		customer.setBalance(customer.getBalance() - amount);
		final String res = customer.toString();
		LOGGER.log(Level.INFO, "{0}",res);
	}

	@Override
	public void generateReciept(final double amountWithTaxes) {
		final String result = "Transaction id: " + (new Random().nextInt()) +
				"Credit Card number: " + this.creditCardNo + "\n" + 
				"Amount: " + amountWithTaxes + "\n";
		LOGGER.log(Level.INFO, result);
	}

}
