package main;

import repoImpl.EmployeeRepoImpl1;
import repoImpl.EmployeeRepoImpl2;
import repoImpl.EmployeeRepoImpl3;
import service.Service;

public class Main1 {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+ "Started main class");
		Service service=null;
		
		long startTime = System.currentTimeMillis();
		service= new Service(new EmployeeRepoImpl1());
		service.run();
		service= new Service(new EmployeeRepoImpl2());
		service.run();
		service= new Service(new EmployeeRepoImpl3());
		service.run();
		
		System.out.println(System.currentTimeMillis()-startTime);
		System.out.println(Thread.currentThread().getName()+" finished fetching main thread");
		
	}

}
