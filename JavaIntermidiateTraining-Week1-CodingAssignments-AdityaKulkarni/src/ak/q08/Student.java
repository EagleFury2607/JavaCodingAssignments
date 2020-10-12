package ak.q08;

/**
 * Data class: Student
 * @author AK
 *
 */
public class Student {
	
	/**
	 * Student rollNo
	 */
	private int rollNo;
	/**
	 * Student name
	 */
	private String name;
	/**
	 * Student location
	 */
	private String location;
	
	/**
	 * public constructor
	 * @param rollNo
	 * @param name
	 * @param location
	 */
	public Student(final int rollNo, final String name, final String location) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.location = location;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(final int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(final String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", location=" + location + "]";
	}
}
