

import java.util.Arrays;//helper class for array manipulation -- binarySearch,sort,toString...

class TestParamPassing4 {
	public static void main(String[] args) {
		int[] myData = { 1, 2, 3, 4, 5 };
	//	int[] newData= doubleIt(myData);

		System.out.println("Orig data - " 
		+ Arrays.toString(myData));
		myData= doubleIt(myData);
		System.out.println("New data - " 
		+ Arrays.toString(myData));
	}
	static int[] doubleIt(int[] ints) {
		int[] tmp = new int[ints.length * 2];
		for (int i = 0; i < ints.length; i++) {
			tmp[i] = ints[i] * 2;
		}
		return tmp;
	}
}
-------------------------------------------------------------
o/p------------

C:\Users\Admin\Desktop\Core Java\day2_data\day2_data\day2_help\params_passing>java TestParamPassing4.java 
Orig data - [1, 2, 3, 4, 5]
New data - [2, 4, 6, 8, 10, 0, 0, 0, 0, 0]

------------------------------------------------------------------------