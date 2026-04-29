package service;

import repo.EmployeeRepo;

public class Service_2 extends Thread{

	EmployeeRepo employeeRepo=null;
	
	public Service_2(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo=employeeRepo;
	}
	
   public void run() {
	   System.out.println("Thread started "+Thread.currentThread().getName()+employeeRepo);
	   employeeRepo.displayNames();
	   System.out.println("Thread finished "+Thread.currentThread().getName()+employeeRepo);
	   
   }
	
	
	
	
	
	
}
