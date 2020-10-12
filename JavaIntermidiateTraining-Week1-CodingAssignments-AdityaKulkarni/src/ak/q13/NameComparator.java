package ak.q13;

import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * NameComparator implements Comparator on Customer objects wrt name.
 * @author AK
 *
 */
public class NameComparator implements Comparator<Customer>{

	/**
	 * public constructor
	 */
	public NameComparator() {
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "NameComparator invoked");
	}
	
	@Override
	public int compare(final Customer arg0, final Customer arg1) {
		final StringBuilder string1 = new StringBuilder(arg0.getName());
		final StringBuilder string2 = new StringBuilder(arg1.getName());
		
		return string1.compareTo(string2);
	}

}
