package ak.q08;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Showcasing encapsulation and data hiding
 * @author AK
 *
 */
public final class Encapsulation {
	
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private Encapsulation() {
		LOGGER.log(Level.INFO, "Starting ...");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		
		final Student student = new Student(1, "AK", "Pune");
		
		String studentDetails = student.toString();
		LOGGER.log(Level.INFO, "{0}", studentDetails);
		
		student.setRollNo(2);
		student.setName("XY");
		student.setLocation("Mumbai");
		
		studentDetails = student.getRollNo() + ", " + student.getName() + ", " + student.getLocation();
		LOGGER.log(Level.INFO, "{0}", studentDetails);
	}
}
