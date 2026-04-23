package repoImpl;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;
import repo.EmployeeRepo;

public class EmployeeRepoImpl2 implements EmployeeRepo{
	
	private static List<Employee> names = new ArrayList<>();
	
	
	static {
		names.add(new Employee(201,"ragavi"));
		names.add(new Employee(202,"ari"));
		names.add(new Employee(203,"rag"));
		names.add(new Employee(204,"arikandhan"));
	}


	@Override
	public void displayNames() {
		// TODO Auto-generated method stub
		for(Employee emp: names) {
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
		return "EmployeeRepoImpl2";
	}
	

}
