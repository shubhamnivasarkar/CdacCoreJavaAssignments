package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter 1st Vehical details as:- registrationNo : String , color : String , price : double");
			Object v1 = new Vehicle(sc.next(), sc.next(), sc.nextDouble());
			System.out.println(
					"Enter 2nd Vehical details as:- registrationNo : String , color : String , price : double");
			Object v2 = new Vehicle(sc.next(), sc.next(), sc.nextDouble());
			System.out.println(v1.equals(v2)?"SAME":"DIFFRENT");
			System.out.println(v1.hashCode()+" "+v2.hashCode());
			sc.close();
		}
	}

}
