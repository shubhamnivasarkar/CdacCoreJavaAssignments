package com.tester;

import com.geometry.Point2D;
import java.util.Scanner;

class Testpoint2D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Point1: Enter X and Y Co-ordinates ");
		Point2D p1 = new Point2D(scan.nextInt(), scan.nextInt());
		System.out.println("Point1: X and Y Co-ordinates are  =" + p1.getDetails());
		System.out.println("Enter X and Y Co-ordinates ");
		Point2D p2 =new Point2D(scan.nextDouble(), scan.nextDouble());
		System.out.println("Point2: X and Y Co-ordinates are  =" + p2.getDetails());
		System.out.println("Point3: X and Y Co-ordinates are  =" + p2.getDetails());
		System.out.println(p1.isEqual(p2) ? "Same Position" : "Different Position");
		System.out.println("\nDistance between %.2f p1 and p2: " + p1.calDistance(p2));
		scan.close();

	}
}
