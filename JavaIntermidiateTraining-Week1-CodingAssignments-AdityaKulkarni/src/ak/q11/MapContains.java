package ak.q11;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * To test if a map contains mapping for specified key.
 * @author AK
 *
 */
public class MapContains {
	
	/**
	 * To log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * My hashMap object
	 */
	private static Map<Integer, String> hashMap;
	
	/**
	 * public constructor
	 */
	public MapContains() {
		LOGGER.log(Level.INFO, "Object created......");
	}
	
	/**
	 * To check if key is present in hashmap
	 * @param num is the value of key in hashmap
	 */
	public void isPresent(final int num) {
		if (hashMap.containsKey(num)) {
			LOGGER.log(Level.INFO, "{0} is present in map", num);
		} else {
			LOGGER.log(Level.INFO, "{0} is not present in map", num);
		}
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		hashMap = new HashMap<>();
		
		hashMap.put(1, "Emp1");
		hashMap.put(2, "Emp2");
		hashMap.put(3, "Emp3");
		hashMap.put(4, "Emp4");
		hashMap.put(5, "Emp5");
		hashMap.put(6, "Emp6");
		
		final MapContains mapContains = new MapContains();
		
		mapContains.isPresent(3);
		mapContains.isPresent(1);
		mapContains.isPresent(7);
		
	}

}

//Output
//
//Oct 09, 2020 10:32:33 PM ak.q11.MapContains isPresent
//INFO: 3 is present in map
//Oct 09, 2020 10:32:33 PM ak.q11.MapContains isPresent
//INFO: 1 is present in map
//Oct 09, 2020 10:32:33 PM ak.q11.MapContains isPresent
//INFO: 7 is not present in map