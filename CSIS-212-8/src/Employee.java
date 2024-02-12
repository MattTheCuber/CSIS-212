// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final Date birthDate;

	// constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
	}

	// return first name
	public String getFirstName() {return firstName;}

	// return last name
	public String getLastName() {return lastName;}

	// return social security number
	public String getSocialSecurityNumber() {return socialSecurityNumber;}

	// return social security number
	public Date getBirthDate() {return birthDate;}

	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s%nSSN: %s%nBirth Date: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate().toString());
	}

	// abstract method must be overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
}