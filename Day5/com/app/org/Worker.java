package com.app.org;

public class Worker extends Emp {
	
	private double hoursWorked, hourlyRate;

	public Worker(int id, String name, String deptId, double basic, double hoursWorked, double hourlyRate) {
		// TODO Auto-generated constructor stub
		
		super(id,name,deptId,basic);
		
	}
	@Override
	public String toString() {
		return "Worker "+super.toString()+", Hours worked = "+hoursWorked+", Hourly Rate = "+hourlyRate;
	}
	@Override
	public double computeNetSalary() {
		return getBasic()+(hoursWorked*hourlyRate);
	}
	public double gethoursWorked() {
		return hoursWorked;
	}
	public void sethoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double gethourlyRate() {
		return hourlyRate;
	}
	public void sethourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

}
