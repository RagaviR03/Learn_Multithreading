package main;

import repo.EmployeeRepo;
import repoImpl.EmployeeRepoImpl1;
import repoImpl.EmployeeRepoImpl2;
import repoImpl.EmployeeRepoImpl3;
import service.Service_2;

public class Main_2_1 {
	public static void main(String[] args) {
		
		System.out.println("main tghread started" +Thread.currentThread().getName());
		Service_2 service=null;
		
		EmployeeRepo[] employeeRepo= {new EmployeeRepoImpl1(),new EmployeeRepoImpl2(),new EmployeeRepoImpl3()};
		long startTime = System.currentTimeMillis();
		for(int i=0;i<employeeRepo.length;i++) {
			service=new Service_2(employeeRepo[i]);
			service.start();
		}
		
		System.out.println("Main thread finsihed exceuting" +Thread.currentThread().getName()+(startTime-System.currentTimeMillis()));
	}

}
