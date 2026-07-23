package com.elc;

import com.program.Employeee;

public class employeeProcessor {

	public static void main(String[] args) {
		Employeee e1=new Employeee(202,"charan","Developer",5000,4);
		 System.out.println("before promotion");
		System.out.println("id:"+e1.getempid());
		System.out.println("name:"+e1.getName());
		System.out.println("designation:"+e1.getDesignation());
		System.out.println("Salary:"+e1.getSalary());
		System.out.println("performancerating:"+e1.getPerformancerating());
		
		e1.promoteEmployee();
		 System.out.println("After promotion:");
System.out.println("new designation:"+e1.getDesignation());
System.out.println("new salary:"+e1.getSalary());
	}


}
