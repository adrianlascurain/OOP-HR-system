package hr.classes;


public class SalesRep extends Employee {
	double salesMade;
	
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	} // public SalesRep
	
	public double calculateComission() {
		return 0.1 * this.salesMade;
	} // calculateComission

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", calculateComission()=" + calculateComission()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getRegistration()="
				+ getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()=" + getDaysWorked()
				+ ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()=" + getSalary()
				+ ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()=" + timeToRetirement()
				+ ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()=" + calculateBonus() + "]";
	}


	
	
}
