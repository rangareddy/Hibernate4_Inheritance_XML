package com.varasofttech.pojo;

public class Employee extends Person {
	private String designation;
    private Double salary;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary
				+ "]";
	}

}
