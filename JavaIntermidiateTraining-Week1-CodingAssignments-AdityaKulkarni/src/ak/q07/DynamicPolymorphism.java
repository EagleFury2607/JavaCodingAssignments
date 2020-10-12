package ak.q07;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Showcasing dynamic polymorphism
 * @author AK
 *
 */
public class DynamicPolymorphism extends SuperClass{

	/**
	 * message to user
	 */
	private static final String MESSAGE = "Inside SubClass";
	
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * public constructor
	 */
	public DynamicPolymorphism() {
		super();
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Starting");
	}
	
	@Override
	public String getMessage() {
		return MESSAGE + ": Hello World !!!";
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		SuperClass class1;
		
		class1 = new SuperClass();
		LOGGER.log(Level.INFO, class1.getMessage());
		
		class1 = new DynamicPolymorphism();
		LOGGER.log(Level.INFO, class1.getMessage());
		
	}

}
