package ak.q09;

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
	void payment(double amount);
	
	/**
	 * print payment details to console
	 * @param amountWithTaxes
	 */
	void generateReciept(double amountWithTaxes);
}
