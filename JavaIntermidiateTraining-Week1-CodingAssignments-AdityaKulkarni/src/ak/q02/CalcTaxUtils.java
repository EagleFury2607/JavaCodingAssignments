package ak.q02;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * to calculate tax from annual salary
 * @author AK
 *
 */
public final class CalcTaxUtils {
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * private constructor
	 */
	private CalcTaxUtils() {
		LOGGER.log(Level.INFO, "Starting ......");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		
		boolean continueCalc = true;
		final Scanner scanner = new Scanner(System.in);
		
		while(continueCalc) {
			LOGGER.log(Level.INFO, "Enter annual salary (in Lacs): ");
			final double salary = scanner.nextDouble();
			LOGGER.log(Level.INFO, "Are you female(true/false): ");
			final boolean isFemale = scanner.nextBoolean();
			
			double taxableAmt = CalcTaxUtils.getTax(salary);
			if(isFemale && salary > 1.5) {
				taxableAmt -= 0.02;
			}
			LOGGER.log(Level.INFO, "Tax amount: {0} Lacs", taxableAmt);
			LOGGER.log(Level.INFO, "Do another calculation (true/false): ");
			continueCalc = scanner.nextBoolean();
		}
		scanner.close();
	}
	
	/**
	 * to calculate tax
	 * @param salary
	 * @return tax
	 */
	public static double getTax(final double salary) {
		double tax; 
		if (salary < 1.5) {
			tax = 0;
		} else if (salary < 5) {
			tax = salary * 0.05;
		} else if (salary < 10) {
			tax = salary * 0.1;
		} else if (salary < 15) {
			tax = salary * 0.2;
		} else if (salary < 30) {
			tax = salary * 0.35;
		} else {
			tax = salary * 0.4;
		}
		return tax;
	}
}
//Output
//
//Oct 11, 2020 11:28:57 PM ak.q02.CalcTax main
//INFO: Enter annual salary (in Lacs): 
//4
//Oct 11, 2020 11:29:00 PM ak.q02.CalcTax main
//INFO: Are you female(true/false): 
//false
//Oct 11, 2020 11:29:04 PM ak.q02.CalcTax main
//INFO: Tax amount: 0.2 Lacs
//Oct 11, 2020 11:29:04 PM ak.q02.CalcTax main
//INFO: Do another calculation (true/false): 
//true
//Oct 11, 2020 11:29:08 PM ak.q02.CalcTax main
//INFO: Enter annual salary (in Lacs): 
//4
//Oct 11, 2020 11:29:10 PM ak.q02.CalcTax main
//INFO: Are you female(true/false): 
//true
//Oct 11, 2020 11:29:13 PM ak.q02.CalcTax main
//INFO: Tax amount: 0.18 Lacs
//Oct 11, 2020 11:29:13 PM ak.q02.CalcTax main
//INFO: Do another calculation (true/false): 
//false
