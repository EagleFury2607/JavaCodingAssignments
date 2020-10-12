package ak.q01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * currency converter
 * @author AK
 *
 */
public final class CurrencyConverter {
	
	/**
	 * Direct currency conversion
	 */
	private static final double[][] DIRECT_CONV = {
			{1.000, 0.846, 0.767, 73.027, 1.385},
			{1.181, 1.000, 0.906, 86.262, 1.636},
			{1.302, 1.102, 1.000, 95.167, 1.804},
			{0.013, 0.011, 0.010, 1.000, 0.018},
			{0.721, 0.610, 0.554, 52.699, 1.000}
	};
	
	/**
	 * Direct currencies
	 */
	private static final List<String> DIRECT_CURR = new ArrayList<>(Arrays.asList("USD", "EUR", "GBP", "INR", "AUD"));
	
	/**
	 * Indirect conversion 1USD = x INDIRECT CURR
	 */
	private static final double[] INDIRECT_CONV = {105.56, 0.11};
	
	/**
	 * Indirect currencies
	 */
	private static final List<String> INDIRECT_CURR = new ArrayList<>(Arrays.asList("JPY", "MAD"));
	
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private CurrencyConverter() {
		LOGGER.log(Level.INFO, "Starting.......");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		boolean continueConv = true;
		
		while(continueConv) {
			if (LOGGER.isLoggable(Level.INFO)) {
				LOGGER.log(Level.INFO, "Available curr: \n\tUS Dollar(USD)\n\tEuropean Euro(EUR)\n\tBritish Pound(GBP)\n\t"
						+ "Indian Rupee(INR)\n\tAustralian Dollar(AUD)\n\tJapanese Yen(JPY)\n\tMorrocan Dirham(MAD)\n\t");
			}
			LOGGER.log(Level.INFO, "Enter from currency: ");
			final String fromCurr = scanner.next();
			
			LOGGER.log(Level.INFO, "Enter to currency: ");
			final String toCurr = scanner.next();
			
			LOGGER.log(Level.INFO, "Enter amount to convert: ");
			final double amount = scanner.nextDouble();
			
			if (DIRECT_CURR.contains(fromCurr)) {
				final int fromIndex = DIRECT_CURR.indexOf(fromCurr);
				if (DIRECT_CURR.contains(toCurr)) {
					final int toIndex = DIRECT_CURR.indexOf(toCurr);
					
					final double result = amount * DIRECT_CONV[fromIndex][toIndex];
					final String out = "Conversion of " + amount + fromCurr + " to " + toCurr + " is " + result;
					LOGGER.log(Level.INFO, out);
				} else {
					final int toIndex = INDIRECT_CURR.indexOf(toCurr);
					
					final double result = amount * DIRECT_CONV[fromIndex][0] * INDIRECT_CONV[toIndex];
					final String out = "Conversion of " + amount + fromCurr + " to " + toCurr + " is " + result;
					LOGGER.log(Level.INFO, out);
				}
			} else {
				final int fromIndex = INDIRECT_CURR.indexOf(fromCurr);
				double result = amount / INDIRECT_CONV[fromIndex];
				if (DIRECT_CURR.contains(toCurr)) {
					final int toIndex = DIRECT_CURR.indexOf(toCurr);
					
					result = result * DIRECT_CONV[0][toIndex];		
					final String out = "Conversion of " + amount + fromCurr + " to " + toCurr + " is " + result;
					LOGGER.log(Level.INFO, out);
				} else {
					final int toIndex = INDIRECT_CURR.indexOf(toCurr);
					
					result = result * INDIRECT_CONV[toIndex];
					final String out = "Conversion of " + amount + fromCurr + " to " + toCurr + " is " + result;
					LOGGER.log(Level.INFO, out);
				}
			}
			
			LOGGER.log(Level.INFO, "Do you want to continue? ");
			continueConv = scanner.nextBoolean();
		}
		
		scanner.close();
	}
}
//Output
//
//Oct 12, 2020 8:32:11 AM ak.q01.CurrencyConverter main
//INFO: Available curr: 
//	US Dollar(USD)
//	European Euro(EUR)
//	British Pound(GBP)
//	Indian Rupee(INR)
//	Australian Dollar(AUD)
//	Japanese Yen(JPY)
//	Morrocan Dirham(MAD)
//	
//Oct 12, 2020 8:32:12 AM ak.q01.CurrencyConverter main
//INFO: Enter from currency: 
//INR
//Oct 12, 2020 8:32:21 AM ak.q01.CurrencyConverter main
//INFO: Enter to currency: 
//USD
//Oct 12, 2020 8:32:23 AM ak.q01.CurrencyConverter main
//INFO: Enter amount to convert: 
//30
//Oct 12, 2020 8:32:26 AM ak.q01.CurrencyConverter main
//INFO: Conversion of 30.0INR to USD is 0.4107
//Oct 12, 2020 8:32:26 AM ak.q01.CurrencyConverter main
//INFO: Do you want to continue? 
//true
//Oct 12, 2020 8:32:29 AM ak.q01.CurrencyConverter main
//INFO: Available curr: 
//	US Dollar(USD)
//	European Euro(EUR)
//	British Pound(GBP)
//	Indian Rupee(INR)
//	Australian Dollar(AUD)
//	Japanese Yen(JPY)
//	Morrocan Dirham(MAD)
//	
//Oct 12, 2020 8:32:29 AM ak.q01.CurrencyConverter main
//INFO: Enter from currency: 
//JPY
//Oct 12, 2020 8:32:33 AM ak.q01.CurrencyConverter main
//INFO: Enter to currency: 
//INR
//Oct 12, 2020 8:32:35 AM ak.q01.CurrencyConverter main
//INFO: Enter amount to convert: 
//900
//Oct 12, 2020 8:32:40 AM ak.q01.CurrencyConverter main
//INFO: Conversion of 900.0JPY to INR is 622.631868131868
//Oct 12, 2020 8:32:40 AM ak.q01.CurrencyConverter main
//INFO: Do you want to continue? 
//false
