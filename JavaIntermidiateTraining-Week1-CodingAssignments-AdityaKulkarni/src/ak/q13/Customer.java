package ak.q13;

/**
 * Custmer Model Class
 * @author AK
 *
 */
public class Customer {
	
	/**
	 * Customer name
	 */
	public final String name;
	/**
	 * Customer age
	 */
	private final int age;
	
	/**
	 * public constructor
	 * @param name
	 * @param age
	 */
	public Customer(final String name, final int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

		@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}
