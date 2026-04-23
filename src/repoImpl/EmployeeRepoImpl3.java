package repoImpl;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import repo.EmployeeRepo;

public class EmployeeRepoImpl3 implements EmployeeRepo{
	
	private static List<Employee> names = new ArrayList<>();
	
	static {
		names.add(new Employee(301,"ragavi"));
		names.add(new Employee(302,"ari"));
		names.add(new Employee(303,"kandhan"));
		names.add(new Employee(304,"rag"));
	}

	@Override
	public void displayNames() {
		// TODO Auto-generated method stub
		for(Employee emp : names) {
			System.out.println(emp);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

	@Override
	public String toString() {
		return "EmployeeRepoImpl3";
	}
	

}
