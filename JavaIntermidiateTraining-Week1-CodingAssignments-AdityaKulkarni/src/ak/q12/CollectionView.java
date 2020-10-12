package ak.q12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * To get collection view of map.
 * @author AK
 *
 */
public final class CollectionView {
	/**
	 * To log output to console.
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * Private constructor
	 */
	private CollectionView() {
		LOGGER.log(Level.INFO, "Private constructor");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final Map<Integer, String> hashMap = new ConcurrentHashMap<>();
		
		hashMap.put(1, "Emp1");
		hashMap.put(2, "Emp2");
		hashMap.put(3, "Emp3");
		hashMap.put(4, "Emp4");
		hashMap.put(5, "Emp5");
		hashMap.put(6, "Emp6");
		
		LOGGER.log(Level.INFO, "Collecction view is: {0}", hashMap.values());
	}
}
//
//Output:
//	
//	Oct 09, 2020 10:44:13 PM ak.q12.CollectionView main
//	INFO: Collecction view is: [Emp1, Emp2, Emp3, Emp4, Emp5, Emp6]
