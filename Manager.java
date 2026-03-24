package org.Employee;

public class Manager extends Employee {
	float hra;

	public Manager(String name, String address, int age, String gender, float basicSalary,float hra)
	{
		super(name, address, age, gender, basicSalary);
		setHra(hra);
		
		
		}
	@Override
public String display() {
	StringBuffer buffer=new StringBuffer(super.display());
	buffer.append("\n Hra:");
	buffer.append(hra);
	return buffer.toString();
	
}
	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		if (hra>0)
		this.hra = hra;
	}
	public float TotalSalary() {
		return basicSalary+hra;
	}
	

}
