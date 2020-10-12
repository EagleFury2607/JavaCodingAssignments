package ak.q03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Build a program that performs Scientific Calculations.
 * Like Tan, Cosine, Secant, square root, cube root.
 * @author AK
 */
public final class MathUtilities {

	/**
	 * @param LOGGER This is used to print output on console 
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * @param num Initialized to 25 so as to pass in Math library functions
	 */
	private static final double NUM = 25;
	
	private MathUtilities() {
		LOGGER.log(Level.INFO, "Trying out Math library !!!!");
	}
	
	/**
	 * main function
	 * @param args
	 */
	public static void main(final String[] args) {
		
		String message;
		
		//tan
		message = "tan(25) = " + Math.tan(NUM) + "\n";
		LOGGER.log(Level.INFO, message);
		
		//cos
		message = "cos(25) = " + Math.cos(NUM) + "\n";
		LOGGER.log(Level.INFO, message);
		
		//sec
		message = "sec(25) = " + (1 / Math.cos(NUM)) + "\n";
		LOGGER.log(Level.INFO, message);
		
		//square root
		message = "sqrt(25) = " + Math.sqrt(NUM) + "\n";
		LOGGER.log(Level.INFO, message);
		
		//cube root
		message = "cbrt(25) = " + Math.cbrt(NUM) + "\n";
		LOGGER.log(Level.INFO, message);
	}

}

//Output
//
//Oct 07, 2020 8:58:03 PM ak.q3.MathUtilities main
//INFO: tan(25) = -0.13352640702153587
//
//Oct 07, 2020 8:58:03 PM ak.q3.MathUtilities main
//INFO: cos(25) = 0.9912028118634736
//
//Oct 07, 2020 8:58:03 PM ak.q3.MathUtilities main
//INFO: sec(25) = 1.0088752655170414
//
//Oct 07, 2020 8:58:03 PM ak.q3.MathUtilities main
//INFO: sqrt(25) = 5.0
//
//Oct 07, 2020 8:58:03 PM ak.q3.MathUtilities main
//INFO: cbrt(25) = 2.924017738212866
//
