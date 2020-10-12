package ak.q13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * program to sort customers with name and age.
 * @author AK
 *
 */
public final class CustomerSort {
	
	/**
	 * to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * private constructor 
	 */
	private CustomerSort() {
		LOGGER.log(Level.INFO, "invoked");
	}
	
	/**
	 * main function
	 * @param args
	 */
	public static void main(final String[] args) {
		final List<Customer> list = new ArrayList<>();
		StringBuilder result;
		
		list.add(new Customer("Emp1", 20));
		list.add(new Customer("Emp5", 60));
		list.add(new Customer("Emp8", 80));
		list.add(new Customer("Emp3", 70));
		list.add(new Customer("Emp2", 10));
		
		result = new StringBuilder("Original list: \n");
		for (final Customer customer : list) {
			result.append(customer.toString()).append("\n");
		}
		
		LOGGER.log(Level.INFO, "{0}", result);
		
		Collections.sort(list, new NameComparator());
		
		result = new StringBuilder("Sorting using Name: \n");
		for (final Customer customer : list) {
			result.append(customer.toString()).append("\n");
		}
		
		LOGGER.log(Level.INFO, "{0}", result);
		
		Collections.sort(list, new AgeComparator());
		
		result = new StringBuilder("Sorting using Age: \n");
		for (final Customer customer : list) {
			result.append(customer.toString()).append("\n");
		}
		
		LOGGER.log(Level.INFO, "{0}", result);
	}
}

//Output:
//	
//Oct 10, 2020 3:34:09 PM ak.q13.CustomerSort main
//INFO: Original list: 
//Customer [name=Emp1, age=20]
//Customer [name=Emp5, age=60]
//Customer [name=Emp8, age=80]
//Customer [name=Emp3, age=70]
//Customer [name=Emp2, age=10]
//
//Oct 10, 2020 3:34:09 PM ak.q13.NameComparator <init>
//INFO: NameComparator invoked
//Oct 10, 2020 3:34:09 PM ak.q13.CustomerSort main
//INFO: Sorting using Name: 
//Customer [name=Emp1, age=20]
//Customer [name=Emp2, age=10]
//Customer [name=Emp3, age=70]
//Customer [name=Emp5, age=60]
//Customer [name=Emp8, age=80]
//
//Oct 10, 2020 3:34:09 PM ak.q13.AgeComparator <init>
//INFO: AgeComparator invoked
//Oct 10, 2020 3:34:09 PM ak.q13.CustomerSort main
//INFO: Sorting using Age: 
//Customer [name=Emp2, age=10]
//Customer [name=Emp1, age=20]
//Customer [name=Emp5, age=60]
//Customer [name=Emp3, age=70]
//Customer [name=Emp8, age=80]
//
