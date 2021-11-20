package management;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Customer {


	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	
	private Date dateOfBith;
	private CustomerType customerType;
	
	public static SimpleDateFormat sdf;
	
	static {
		sdf= new SimpleDateFormat("dd/MM/yyyy");
	}

	
	public Customer( String name, String email, String password, double registrationAmount, Date dateOfBith,
			CustomerType customerType) {
		super();
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dateOfBith = dateOfBith;
		this.customerType = customerType;
	}
	public Customer(String email) {
		
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [ Email"+email+", Name "+name+", password "+password+", Registration amount "+registrationAmount+"Date of Birth "+sdf.format(dateOfBith)+", Customer Type "+customerType+" ]";
		
		
		
	}@Override
	public boolean equals(Object duplicateCustomer) {
		System.out.println("in customer's duplication");
		if (duplicateCustomer instanceof Customer) {
			
		return email.equals(((Customer) duplicateCustomer).email);
		}
		return false;
		
	}

	
}
