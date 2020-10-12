package ak.q07;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Showcasing static polymorphism
 * @author AK
 *
 */
public class StaticPolymorphism {
	
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * public cunstructor
	 */
	public StaticPolymorphism() {
		LOGGER.log(Level.INFO, "Invoked ....");
	}
	
	/**
	 * Adding two integers
	 * @param param1
	 * @param param2
	 * @return to return sum
	 */
	public int add(final int param1, final int param2) {
		return param1 + param2;
	}
	
	/**
	 * Adding(Concatinating two strings)
	 * @param param1
	 * @param param2
	 * @return to return concatinated string
	 */
	public String add(final String param1, final String param2) {
		return param1 + param2;
	}
	
	/**
	 * Adding to doubles
	 * @param param1
	 * @param param2
	 * @return to return sum
	 */
	public double add(final double param1, final double param2) {
		return param1 + param2;
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final StaticPolymorphism polymorphism = new StaticPolymorphism();
		
		LOGGER.log(Level.INFO, "Addition of ints(10, 20) : {0}", polymorphism.add(10, 20));
		
		LOGGER.log(Level.INFO, "Addition of strings(\"Hello \", \"World !!\") : {0}", polymorphism.add("Hello ", "World !!"));
		
		LOGGER.log(Level.INFO, "Addition of ints(15.5, 51.56) : {0}", polymorphism.add(15.5, 51.56));
	}
}

//Output
//
//Oct 10, 2020 8:04:33 PM ak.q07.StaticPolymorphism <init>
//INFO: Invoked ....
//Oct 10, 2020 8:04:33 PM ak.q07.StaticPolymorphism main
//INFO: Addition of ints(10, 20) : 30
//Oct 10, 2020 8:04:33 PM ak.q07.StaticPolymorphism main
//INFO: Addition of strings("Hello ", "World !!") : Hello World !!
//Oct 10, 2020 8:04:33 PM ak.q07.StaticPolymorphism main
//INFO: Addition of ints(15.5, 51.56) : 67.06