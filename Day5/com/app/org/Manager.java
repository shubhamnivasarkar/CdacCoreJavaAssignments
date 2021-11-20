package com.app.org;

public class Manager extends Emp {
	private double performancebonus;
	

	public Manager(int id, String name, String deptId, double basic, double performancebonus) {
		// TODO Auto-generated constructor stub
		super(id,name,deptId,basic);
	}
	@Override
	public String toString() {
		return "Manager "+super.toString()+", Performance bonus = "+performancebonus;
	}
	@Override
	public double computeNetSalary()
	{
		return getBasic()+this.performancebonus;
	}
	public double getperfmonceBonus()
	{
		return this.performancebonus;
	}
	
	public void setperfmonceBonus(double incBonus)
	{
		this.performancebonus=this.performancebonus+incBonus;
	}
}
