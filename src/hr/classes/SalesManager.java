package hr.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep {
	private HashMap <Integer,SalesRep> salesTeam;

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<Integer, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}
	
	
	   public double calculateComission(){
		      // 0.03 * all sales made by team
		   double sales = 0;
		    for(SalesRep rep :salesTeam.values()) {
		    	sales += rep.salesMade;
		    }
		    return 0.03 * sales;
	   }
	   
	  
	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}


	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}


	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", salesMade=" + salesMade + ", calculateComission()="
				+ calculateComission() + ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()="
				+ getAge() + ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()="
				+ getVacationDaysTaken() + ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked()
				+ ", timeToRetirement()=" + timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft()
				+ ", calculateBonus()=" + calculateBonus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}



	   
	   
}
