package org.Employee;

public class SalesPerson  extends Employee{
    float commission;
    float totalSalary;
	public SalesPerson(String name, String address, int age, String gender, float basicSalary,float commission) {
		super(name, address, age, gender, basicSalary);
		setCommission(commission);
	}
	@Override
public String display() {
	StringBuffer buffer=new StringBuffer(super.display());
	buffer.append("\n commission:");
	buffer.append(commission);
	return buffer.toString();
	
}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		if(commission>0)
		this.commission = commission;
	}
	public float TotalSalaray() {
		return commission+basicSalary;
		
	}
	
	

}
