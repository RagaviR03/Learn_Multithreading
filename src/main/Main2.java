package main;

import repo.EmployeeRepo;
import repoImpl.EmployeeRepoImpl1;
import repoImpl.EmployeeRepoImpl2;
import repoImpl.EmployeeRepoImpl3;
import service.Service;

public class Main2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Started fetching main class");
		
		
		Service service= null;
		EmployeeRepo[] emplRepo= {new EmployeeRepoImpl1(),new EmployeeRepoImpl2(),new EmployeeRepoImpl3()};
		long startTime = System.currentTimeMillis();
		for(int i=0;i<emplRepo.length;i++) {
			service=new Service( emplRepo[i]);
			service.run();
		}
		
		System.out.println(System.currentTimeMillis()-startTime);
		System.out.println("Finihed");
		
	}

}
