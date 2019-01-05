package exercise1219_2;

import java.io.*;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1169325356801248564L;
	
	private int eId;
	private String eName;
	private String dept;
	private int salary;
	private double bPoint;
	
	public Employee() {}

	public Employee(int eId, String eName, String dept, int salary, double bPoint) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.dept = dept;
		this.salary = salary;
		this.bPoint = bPoint;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getbPoint() {
		return bPoint;
	}

	public void setbPoint(double bPoint) {
		this.bPoint = bPoint;
	}
	
	public String toString() {
		return eId + ", " + eName + ", " + dept + ", " + salary + ", " + bPoint;
	}
	

}
