// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
	public static void main(String[] args) {
		// create today's date
		Date today = new Date(2, 24, 2022);
		
		// create subclass objects                                          
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(2, 24, 1740), 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(12, 31, 2000), 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(9, 17, 1976), 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(2, 2, 2222), 5000, .04, 300);

		// create four-element Employee array
		Employee[] employees = new Employee[4];

		// initialize array with Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.printf("Employees processed polymorphically:%n%n");

		// generically process each element in array employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invokes toString

			// determine whether element is a BasePlusCommissionEmployee
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast Employee reference to
				// BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}
			
			// Store the earnings amount for the current employee
			double currentEmployeeEarnings = currentEmployee.earnings();
			// Store the employee's birth date
			Date currentEmployeeBirthDate = currentEmployee.getBirthDate();

			// Determine whether employee's birthday is this month
			if (currentEmployeeBirthDate.getMonth() == today.getMonth()) {
				// Add a $100 bonus
				currentEmployeeEarnings += 100;
				System.out.println("added a $100 brith month bonus");
			}

			System.out.printf(" = Earned $%,.2f this month%n%n", currentEmployeeEarnings);
		}
	}
}