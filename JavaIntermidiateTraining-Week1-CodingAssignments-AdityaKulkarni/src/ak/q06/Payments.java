package ak.q06;

/**
 * Interface paymnets, child class will be payment modes.
 * @author AK
 *
 */
public interface Payments {
	/**
	 * make payment including taxes
	 * @param amount
	 */
	void payment(Customer customer, double amount);
	
	/**
	 * print payment details to console
	 * @param amountWithTaxes
	 */
	void generateReciept(double amountWithTaxes);
}
