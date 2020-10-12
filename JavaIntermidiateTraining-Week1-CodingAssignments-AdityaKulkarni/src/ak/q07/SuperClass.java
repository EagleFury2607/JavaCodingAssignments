package ak.q07;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Superclass to showcase dynamic polymorphism
 * @author AK
 *
 */
public class SuperClass {
	
	/**
	 * message to user
	 */
	private static final String MESSAGE = "Inside SuperClass";
	
	/**
	 * public constructor
	 */
	public SuperClass() {
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Starting");
	}
	
	public String getMessage() {
		return MESSAGE + ": Hello World !!!";
	}
}
