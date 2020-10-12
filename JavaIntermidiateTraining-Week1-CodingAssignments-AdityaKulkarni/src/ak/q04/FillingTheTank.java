package ak.q04;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program to calculate rate of liquid to fill a cylindrical
 * tank with given dimensions of tank and pipe in
 * 1 / 2 / 3 / 4 hours.
 * @author AK
 *
 */
public class FillingTheTank {
	
	/**
	 * @param LOOGER to log output to console
	 */
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	/**
	 * height if tank given in ft
	 */
	private static final int HEIGHT_OF_TANK = 20;
	
	/**
	 * diameter of tank given in ft
	 */
	private static final int DIAMETER_OF_TANK = 5;
	
	/**
	 * diameterof pipe in meters
	 */
	private static final int DIAMETER_OF_PIPE = 5;

	
	/**
	 * Public constructor
	 */
	public FillingTheTank() {
		LOGGER.log(Level.INFO, "Calculating rateof flow !!!!!");
	}
	
	/**
	 * To calculate rate at which liquid should flow.
	 * @param hours The time in which tank should be filled
	 */
	public double calculateRateOfFlow(final int hours) {
		double rateOfFlow;
				
		/* 
		 * calculating volume of tank and cross sectional area of pipe 
		 * which are required to calculate rate of flow.
		 */
		final double volumeOfTank = Math.PI * (Math.pow(DIAMETER_OF_TANK * 0.3048 / 2, 2)) * (HEIGHT_OF_TANK * 0.3048);
		final double areaCrossSec = Math.PI * Math.pow((double)DIAMETER_OF_PIPE / 2, 2);
		
		//rate of flow
		rateOfFlow = volumeOfTank / (areaCrossSec * hours);
				
		return rateOfFlow;
	}
	
	/**
	 * main function
	 */
	public static void main(final String[] args) {
		final FillingTheTank fillingTheTank = new FillingTheTank();
		double result;
		
		//Filling tank in 1hr
		result = fillingTheTank.calculateRateOfFlow(1);
		LOGGER.log(Level.INFO, "Rate reuired to fill tank in 1hr: {0}  m/hr",result);
		
		//Filling tank in 2hr
		result = fillingTheTank.calculateRateOfFlow(2);
		LOGGER.log(Level.INFO, "Rate reuired to fill tank in 2hr: {0}  m/hr",result);
				
		//Filling tank in 3hr
		result = fillingTheTank.calculateRateOfFlow(3);
		LOGGER.log(Level.INFO, "Rate reuired to fill tank in 3hr: {0}  m/hr",result);
				
		//Filling tank in 4hr
		result = fillingTheTank.calculateRateOfFlow(4);
		LOGGER.log(Level.INFO, "Rate reuired to fill tank in 4hr: {0}  m/hr",result);
	}
}

//Output:
//
//Oct 08, 2020 11:28:43 AM ak.q4.FillingTheTank <init>
//INFO: Calculating rateof flow !!!!!
//Oct 08, 2020 11:24:07 AM ak.q4.FillingTheTank main
//INFO: Rate reuired to fill tank in 1hr: 0.885  m/hr
//Oct 08, 2020 11:24:07 AM ak.q4.FillingTheTank main
//INFO: Rate reuired to fill tank in 2hr: 0.442  m/hr
//Oct 08, 2020 11:24:07 AM ak.q4.FillingTheTank main
//INFO: Rate reuired to fill tank in 3hr: 0.295  m/hr
//Oct 08, 2020 11:24:07 AM ak.q4.FillingTheTank main
//INFO: Rate reuired to fill tank in 4hr: 0.221  m/hr