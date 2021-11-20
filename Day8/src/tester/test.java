package tester;

import static utils.ValidationRules.validateRegistrationAmout;

import static utils.ValidationRules.validatePwd;

import static utils.ValidationRules.newcustomer;
import static utils.ValidationRules.convertDate;


import java.util.Scanner;
import management.Customer;



public class test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter password");
			validatePwd(sc.next());
			System.out.println("Enter Reg Amount");
			validateRegistrationAmout(sc.nextDouble());
		
			System.out.println("Enter CustomerType");
			newcustomer(sc.next());
			System.out.println("Enter Date of Birth");
			convertDate(sc.next());
			
			System.out.println("Enter details of the  customer  name password email registration amount date(day-mon-yr) customerType");
			Customer c1= new Customer (sc.next(), validatePwd(sc.next()),(sc.next()),validateRegistrationAmout(sc.nextDouble()), convertDate(sc.next()),
					newcustomer(sc.next()));
			System.out.println(c1);
		} catch (Exception e) {
			e.printStackTrace();
		//	System.out.println(e.getMessage());
		}
		
		
		}
}


