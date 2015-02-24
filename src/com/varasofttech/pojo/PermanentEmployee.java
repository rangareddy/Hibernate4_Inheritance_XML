package com.varasofttech.pojo;

public class PermanentEmployee extends Employee {
    private double allowance;
    private int noOfLeaves;
    
    // Constructors and Getter/Setter methods, 
    public double getAllowance() {
   	 return allowance;
    }
    public void setAllowance(double allowance) {
   	 this.allowance = allowance;
    }
    public int getNoOfLeaves() {
   	 return noOfLeaves;
    }
    public void setNoOfLeaves(int noOfLeaves) {
   	 this.noOfLeaves = noOfLeaves;
    }    

}
