package ak.q10;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program to shallow copy a HashMap
 * @author AK
 *
 */
public class ShallowCopy {

	/**
	 *  LOGGER log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * instance variable to create a shallow copy
	 */
	private final Map<String, String> instanceVar;
	
	/**
	 * constant EMP_NAME used while logging
	 */
	private static final String EMP_NAME = "Emp name: ";
	
	/**
	 * constant EMP_EMAIL_ID used while logging
	 */
	private static final String EMP_EMAIL_ID = " , Emp emailId: ";
	
	public Map<String, String> getInstanceVar() {
		return instanceVar;
	}
	
	/**
	 * constructor creates shallow copy of paramVar into instanceVar
	 * @param paramVar is in parameter used for shallow copy
	 */
	public ShallowCopy(final Map<String, String> paramVar) {
		instanceVar = paramVar;
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final HashMap<String, String> paramVar = new HashMap<>();
		
		paramVar.put("Emp1", "emp1@xy.com");
		paramVar.put("Emp2", "emp2@xy.com");
		
		LOGGER.log(Level.INFO, "paramVar\n");
		for (final Map.Entry<String, String> entry : paramVar.entrySet()) {
			final String message = EMP_NAME + entry.getKey() + EMP_EMAIL_ID + entry.getValue();
			LOGGER.log(Level.INFO, message);
		}
		
		final ShallowCopy shallowCopy = new ShallowCopy(paramVar);
		final Map<String, String> map = shallowCopy.getInstanceVar(); 
		
		LOGGER.log(Level.INFO, "shallowCopy\n");
		for (final Map.Entry<String, String> entry : map.entrySet()) {
			final String message = EMP_NAME + entry.getKey() + EMP_EMAIL_ID + entry.getValue();
			LOGGER.log(Level.INFO, message);
		}
		
		LOGGER.log(Level.INFO, "changing paramVar (Emp1,emp1@xy.com) to (Emp8,emp8@xy.com)\n");
		paramVar.replace("Emp1", "emp1@xy.com", "emp8@xy.com");
		
		LOGGER.log(Level.INFO, "shallowCopy\n");
		for (final Map.Entry<String, String> entry : map.entrySet()) {
			final String message = EMP_NAME + entry.getKey() + EMP_EMAIL_ID + entry.getValue();
			LOGGER.log(Level.INFO, message);
		}
	}

}

//Output
//
//Oct 08, 2020 10:08:12 PM ak.q10.ShallowCopy main
//INFO: paramVar
//
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: Emp name: Emp1 , Emp emailId: emp1@xy.com
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: Emp name: Emp2 , Emp emailId: emp2@xy.com
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: shallowCopy
//
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: Emp name: Emp1 , Emp emailId: emp1@xy.com
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: Emp name: Emp2 , Emp emailId: emp2@xy.com
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: changing paramVar (Emp1,emp1@xy.com) to (Emp8,emp8@xy.com)
//
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: shallowCopy
//
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: Emp name: Emp1 , Emp emailId: emp8@xy.com
//Oct 08, 2020 10:08:13 PM ak.q10.ShallowCopy main
//INFO: Emp name: Emp2 , Emp emailId: emp2@xy.com
