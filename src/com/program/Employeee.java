package com.program;



public class Employeee {
	int empid ;
	String name;
	String designation;
	double Salary;
   int performancerating;
   
  public Employeee(int empid ,String name,String designation,double Salary,int performancerating){
	 
	 this.empid=empid;
	 this.name=name;
	 this.designation=designation;
	 this.Salary=Salary;
	 this.performancerating=performancerating;
	 
   }
  public void setSalary(double Salary)   {
		this.Salary = Salary;
		
	}

		public void setdesignation(String designation) {
		this.designation =designation;
		}

	public int getempid() {
	return empid;
}


   public String getName() {
	return name;
   }


   public String getDesignation() {
	return designation;
   }


   public double getSalary() {
	   
	   
	return Salary;
   }


   public int getPerformancerating() {
	return performancerating;
   }
   
 

 public void promoteEmployee() {
	
	
	 if(performancerating>=4) {

		 Salary=Salary+Salary*20/100;
		 designation="senior developer";
		
	 }
	 else {
		 System.out.println("no promotion");
	 }
		
		
		
		
	
		
		
		
		
		
	
	

	}

}
