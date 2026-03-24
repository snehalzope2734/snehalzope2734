package org.Employee;

public class Engineer extends Employee{
    float overTime;
    private float extraAmountPerMinute = 20;
	public Engineer(String name, String address, int age, String gender, float basicSalary,float overTime) {
		super(name, address, age, gender, basicSalary);
		
		setOverTime(overTime);
	}
	@Override
public String display() {
	StringBuffer buffer=new StringBuffer(super.display());
	buffer.append("Overtime:");
	buffer.append(overTime);
	return buffer.toString();
	
}
	
	
	public float getOverTime() {
		return getOverTime();
	}
	public void setOverTime(float overTime) {
		if (overTime>1) 
		this.overTime = overTime;
		
	}
	// funtion compute total salary
	public float TotalSalary() {
		return 60*overTime*extraAmountPerMinute;  //convert hr to min and then min*20
		
	}
	
	
	

}
