package ak.q14;

import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * showcasing synchronization in hashtable
 * @author AK
 *
 */
public class SyncInHashTable implements Runnable{
	
	/**
	 * to log output in console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * my hashtable object to work on
	 */
	private final Map<Integer, String> hashtable = new Hashtable<>();
	
	/**
	 * Thread object1
	 */
	private Thread thread1;
	
	/**
	 * Thread object1
	 */
	private Thread thread2;
	
	/**
	 * public constructor
	 */
	public SyncInHashTable() {
		hashtable.put(1, "Emp1");
		hashtable.put(2, "Emp2");
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final SyncInHashTable inHashTable = new SyncInHashTable();
		
		inHashTable.thread1 = new Thread(inHashTable);
		inHashTable.thread2 = new Thread(inHashTable);
		inHashTable.thread1.start();
		inHashTable.thread2.start();
	}

	@Override
	public void run() {
		final String output = Thread.currentThread().getName()+": "+hashtable.put(4, "EMP")+","+thread1.getState()+","+thread2.getState();
		LOGGER.log(Level.INFO, output);
	} 
}
//OUTPUT
//
//Oct 11, 2020 11:01:50 AM ak.q14.SyncInHashTable run
//INFO: Thread-1: EMP,RUNNABLE,RUNNABLE
//Oct 11, 2020 11:01:50 AM ak.q14.SyncInHashTable run
//INFO: Thread-0: null,RUNNABLE,RUNNABLE