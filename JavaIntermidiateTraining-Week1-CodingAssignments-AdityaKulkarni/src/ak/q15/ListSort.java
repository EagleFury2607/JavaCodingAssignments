package ak.q15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program to sort first half in ascending and second half in descending order.
 * @author AK
 *
 */
public final class ListSort {
	/**
	 *  @param LOGGER This is object for printing outut to console 
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * Private Constructor
	 */
	private ListSort() {
		LOGGER.log(Level.INFO, "Sorting list program !!!!!!");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final ArrayList<Integer> list = new ArrayList<>();
		
		//Adding elements in list
		list.add(70);
		list.add(96);
		list.add(46);
		list.add(99);
		list.add(25);
		list.add(1);
		list.add(83);
		list.add(62);
		list.add(15);
		
		//Initial list
		String message = "Original list: " + list;
		LOGGER.log(Level.INFO, message);
		
		//Splitting list in half
		final int listSize = list.size();
		
		final ArrayList<Integer> firstHalf = new ArrayList<>(list.subList(0, listSize/2));
		final ArrayList<Integer> secondHalf = new ArrayList<>(list.subList(listSize/2,listSize));
		
		//Sorting first half in ascending order
		Collections.sort(firstHalf);
		
		//Sorting second half in descending order
		Collections.sort(secondHalf, (Object obj1, Object obj2) -> {
				if (obj1.equals(obj2)) {
					return 0;
				} else if ((Integer)obj1 > (Integer)obj2) {
					return -1;
				} else {
					return 1;
				}
			}
		);
		
		//Merging output
		list.clear();
		list.addAll(firstHalf);
		list.addAll(secondHalf);
		
		//Custom Sorted list
		message = "Custom Sorted list: " + list;
		LOGGER.log(Level.INFO, message);
	}

}

/*
 * 
 * Output:
 * 
 * Original list: [70, 96, 46, 99, 25, 1, 83, 62, 15]
 * Custom Sorted list: [46, 70, 96, 99, 83, 62, 25, 15, 1]
 * 
 */