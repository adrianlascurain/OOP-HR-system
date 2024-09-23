package hr;
import java.util.HashMap;

import hr.classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("John", "Doe", 12345, 45, 1800, 5, 50000.0, 20);
		SalesRep salesRep1 = new SalesRep("Juan", "Pérez", 10234, 35, 200, 10, 50000.0, 5, 120000.0);
		SalesManager salesManager = new SalesManager("Carlos", "Ramírez", 20345, 42, 250, 15, 70000.0, 10, 150000.0, new HashMap<>());

		salesManager.getSalesTeam().put(1, salesRep1);
		System.out.println(employee1);
        System.out.println(salesRep1);
        System.out.println(salesManager);
	}

}
