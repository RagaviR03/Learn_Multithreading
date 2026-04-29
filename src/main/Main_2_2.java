package main;

import repo.EmployeeRepo;
import repoImpl.EmployeeRepoImpl1;
import repoImpl.EmployeeRepoImpl2;
import repoImpl.EmployeeRepoImpl3;
import service.Service_2;

public class Main_2_2 {
	public static void main(String[] args) {
		System.out.println("main Strated " + Thread.currentThread().getName());
		Service_2 service = null;

		EmployeeRepo[] employeeRepo = { new EmployeeRepoImpl1(), new EmployeeRepoImpl2(), new EmployeeRepoImpl3() };
		Thread[] t = new Thread[employeeRepo.length];

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < employeeRepo.length; i++) {
			service = new Service_2(employeeRepo[i]);
			t[i] = service;
			t[i].start();
		}

		for (int i = 0; i < employeeRepo.length; i++) {

			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println("Main finsished "+Thread.currentThread().getName()+(System.currentTimeMillis()-startTime));
	}

}
