
public class  TestParamPassing3
{
	public static void main(String[] args) 
	{
	
	Emp e1=new Emp(1,"aa",1000);
	Emp e2=new Emp(2,"ab",2000);
	System.out.println("orig sal bef  ="+e1.getSal() +"  "
	+e2.getSal());
	swap(e1,e2);
	System.out.println(" sal after swap ="+e1.getSal() +"  "+e2.getSal());
	}
	static void swap(Emp e3,Emp e4)
	{
		Emp tmp=e3;
		e3=e4;
		e4=tmp;
		System.out.println("in method after  swap"
		+e3.getSal() +"  "+e4.getSal());
	}
}
--------------------------------------------------
o/p-----------------

C:\Users\Admin\Desktop\Core Java\day2_data\day2_data\day2_help\params_passing>java TestParamPassing3
orig sal bef  =1000.0  2000.0
in method after  swap2000.0  1000.0
 sal after swap =1000.0  2000.0    


-------------------------------------------------------------------------------
