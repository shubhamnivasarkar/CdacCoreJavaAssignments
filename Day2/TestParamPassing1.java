

 class TestParamPassing1 {
	public static void main(String[] args) {
		// write a static method to update emp sal.
		Emp e1 = new Emp(1, "aa", 1000);

		System.out.println("orig sal bef  =" + e1.getSal());
		testMe(e1.getSal(), 100);
		System.out.println("in main, after updation  =" 
		+ e1.getSal());
	}

	static void testMe(double sal, double inc) {
		sal += inc;
		System.out.println("in meth sal=" + sal);
	}

}
--------------------------------
o/p-------

C:\Users\Admin\Desktop\Core Java\day2_data\day2_data\day2_help\params_passing>java TestParamPassing1      
orig sal bef  =1000.0
in meth sal=1100.0
in main, after updation  =1000.0

------------------------------------------------------------------------------------