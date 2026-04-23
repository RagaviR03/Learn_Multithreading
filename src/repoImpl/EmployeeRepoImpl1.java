package repoImpl;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import repo.EmployeeRepo;

public class EmployeeRepoImpl1 implements EmployeeRepo{
	
	private static List<Employee> names= new ArrayList<>();
	
	static {
		names.add(new Employee(101,"raghavi"));
		names.add(new Employee(102,"ari"));
		names.add(new Employee(103,"rag"));
		names.add(new Employee(104,"ravi"));
		
	}

	@Override
	public void displayNames() {
		for(Employee emp:names) {
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
		return "EmployeeRepoImpl";
	}
	

}
