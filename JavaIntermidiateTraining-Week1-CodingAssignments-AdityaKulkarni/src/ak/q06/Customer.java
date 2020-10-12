package ak.q06;

/**
 * Data Class Customer
 * @author AK
 *
 */
public class Customer {
	/**
	 * account id of customer
	 */
	final int accountId;
	/**
	 * name of customer
	 */
	final String name;
	/**
	 * account balance of customer
	 */
	private double balance;
	
	/**
	 * public constructor
	 * @param accountId
	 * @param name
	 * @param balance
	 */
	public Customer(final int accountId,final String name,final double balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}

	
	
	@Override
	public String toString() {
		return "Customer [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(final double balance) {
		this.balance = balance;
	}
}
