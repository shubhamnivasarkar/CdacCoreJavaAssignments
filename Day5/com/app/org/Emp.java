package com.app.org;

public abstract class Emp {
	//State : Tight encapsulation
	private int id;
	private String name;
	private String deptId;
	private double basic;
	
	public Emp(int id, String name, String deptId, double basic) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;
	}

	@Override
	public String toString() {
		return "ID = "+id+", name = "+name+", deptId = "+deptId+", basic = "+getBasic();
	}
	public abstract double computeNetSalary();

	public double getBasic() {
		return basic;
	}

	public int getId() {
		return id;
	}


}
