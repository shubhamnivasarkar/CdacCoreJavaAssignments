package utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import management.Customer;
import customerExcpetion.CustomerHandlingException;
import static management.CustomerType.valueOf;
import static management.Customer.sdf;
import management.CustomerType;

public class ValidationRules {
	
	public static final int max_password;
	public static final int min_password;
	
	
	static {
		min_password = 4;
		max_password = 10;
		
	}
	public static String validatePwd (String password) throws CustomerHandlingException{
		if(password.length()< min_password) 
			throw new CustomerHandlingException("Password is less than 4");
		if(password.length()> max_password) 
			throw new CustomerHandlingException("Password is more than 10");
			
		return password;
	}
	public static double validateRegistrationAmout(double regAmt) throws CustomerHandlingException
	{
		if((regAmt%500)!=0) 
			throw new CustomerHandlingException("Need only 500 denomination");
		return regAmt;
	}
	
			
			@SuppressWarnings("deprecation")
			public static Date convertDate(String date) throws ParseException, CustomerHandlingException
			{
				  if((sdf.parse("01/01/1995")).before(sdf.parse(date)))
				   throw new CustomerHandlingException("DOB should be before 01-01-1995");
			        
				return sdf.parse(date);
			}
			public static String checkForDupilcation(String ipemail, Customer[] customers)throws CustomerHandlingException{
				
				Customer testCustomer = new Customer(ipemail);
				for(Customer c: customers)
					if(c!=null)
						if(c.equals(testCustomer)) {
							;
							throw new CustomerHandlingException("Dup email id!!!!");}
				if(ipemail.contains("@")&&ipemail.endsWith(".com")) {
					return ipemail;		
				}else throw new CustomerHandlingException("Email must contain @ and ends with .com");
					
				
			}
			
			
			
			public static CustomerType newcustomer(String ct) 
			{
				return valueOf(ct);
			}
		
		
	
	}
	
	



