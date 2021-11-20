package tester;
import java.util.Scanner;

import static utils.ValidationRules.*;

import management.Customer;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try(Scanner sc = new Scanner(System.in)){
				System.out.println("Enter the capacity of Customers");
		Customer[] customerArr = new Customer[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("Options 1. Add Customer, 2. Display all, 3. Exit");
			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter Customer detail,name, email, password, reg Amount, DOB, CustomerType");
					Customer c= new Customer((sc.next()),checkForDupilcation(sc.next(),customerArr),validatePwd(sc.next()), validateRegistrationAmout(sc.nextDouble()), convertDate(sc.next()), newcustomer(sc.next()));
					customerArr[counter++]=c;
					System.out.println("CustomerAdded.");
					break;
				case 2:
					System.out.println("All Customer details");
					for(Customer c1 : customerArr)
						if(c1 != null )
							System.out.println(c1);

					break;
				case 3:
					exit = true;

					break;

				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
							
						
			 		
				}
		
			}
		}
	
}