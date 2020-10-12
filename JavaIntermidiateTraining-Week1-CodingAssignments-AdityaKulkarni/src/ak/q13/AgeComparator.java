package ak.q13;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * AgeComparator implements Comparator on Customer objects wrt age.
 * @author AK
 *
 */
public class AgeComparator implements Comparator<Customer>{

	/**
	 * public constructor
	 */
	public AgeComparator() {
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "AgeComparator invoked");
	}
	
	@Override
	public int compare(final Customer arg0, final Customer arg1) {
		return arg0.getAge() - arg1.getAge();
	}
	
}
