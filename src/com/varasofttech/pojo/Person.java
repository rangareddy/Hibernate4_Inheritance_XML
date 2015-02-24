package com.varasofttech.pojo;

public class Person {
	
	private long id;
    private String firstName;
    private String lastName;
    private int age;
    
    // Constructors and Getter/Setter methods, 
    public long getId() {
   	 return id;
    }
    public void setId(long id) {
   	 this.id = id;
    }
    public String getFirstName() {
   	 return firstName;
    }
    public void setFirstName(String firstName) {
   	 this.firstName = firstName;
    }
    public String getLastName() {
   	 return lastName;
    }
    public void setLastName(String lastName) {
   	 this.lastName = lastName;
    }
    public int getAge() {
   	 return age;
    }
    public void setAge(int age) {
   	 this.age = age;
    }
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + "]";
	}   	 

}
