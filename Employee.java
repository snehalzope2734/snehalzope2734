package org.Employee;


public abstract class Employee {
	protected String name,address;
	protected int age;
	protected float basicSalary;
	protected String gender;
	public Employee(String name,String address,int age,String gender,float basicSalary) {
		
		setName(name);
		setAddress(address);
		setAge(age);
		setGender(gender);
		setBasicSalary(basicSalary);
	}
	
	
	public String display() {
		StringBuffer buffer = new StringBuffer("................Employee Details ................. \n ");
		buffer.append("\n Name:");
		buffer.append(name);
		buffer.append("\n Address:");
		buffer.append(address);
		buffer.append("\n Age:");
		buffer.append(age);
		buffer.append("\n Gender:");
		buffer.append(gender);
		buffer.append("\n Basic Salary:");
		buffer.append(basicSalary);
		return buffer.toString();		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name.length()>1 ||name==""){
			this.name = name;
		}
		
	}
	public String getAddress() {
		
		return address;
	}
	public void setAddress(String address) {
		//if(address ==null || address.length()>5 ||address=="")
		 this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age != 0 ||(age >21 && age<70 ))
		  this.age = age;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		if (basicSalary>0)
		 this.basicSalary = basicSalary;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		//if(gender ==  "M" || gender =="F" || gender == "m"||gender== "f" )
 		  this.gender = gender;
	}
	
	
}
