package service;

import repo.EmployeeRepo;

public class Service {
	private EmployeeRepo employeeRepo;
	
	public Service(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo=employeeRepo;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() +"started fetching " +employeeRepo);
		employeeRepo.displayNames();
		System.out.println(Thread.currentThread().getName() +" finish fetching " +employeeRepo);
	}

}
