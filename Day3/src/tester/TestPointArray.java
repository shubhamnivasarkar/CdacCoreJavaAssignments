package tester;

import java.util.Scanner;

import com.geometry.Point2D;


public class TestPointArray {

	public static void main(String[] args) {
		boolean quite = false;
		Scanner sc = new Scanner(System.in);
		System.out.println(" how many points to plot? ");
		Point2D[] point = new Point2D[sc.nextInt()];

		
		do {
			System.out.println("Choise from following: ");
			System.out.println("1. Plot new point on given index");
			System.out.println("2. For display all inputs");
			System.out.println("3. For test equality of two points");
			System.out.println("4. For calculate index");
			System.out.println("10. Exit..!!");
			int choise = sc.nextInt();

			switch (choise) {

			case 1:
				System.out.println("Enter index and new point coordinates");
				int a = sc.nextInt();
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				if (a < point.length) {
					point[a] = new Point2D(x, y);
				
				}else {
					System.out.println("Index out of range");
				}
				break;
			case 2:
				for (Point2D b : point) {
					if(b!=null)
					System.out.println(b.getDetails());
				}

				break;
			case 3:
				System.out.println("Enter the indexes to test equality of two points");
				int k = sc.nextInt();
				int j = sc.nextInt();
				if (k < point.length && j < point.length) {
					System.out.println(point[k].isEqual(point[j]) ? "SAME" : "Different");
				} else
					System.out.println("Index out of bound");
				break;
			case 4:
				System.out.println("Enter the indexes to check distance inbetween");
				int c = sc.nextInt();
				int v = sc.nextInt();
				if (c < point.length && v < point.length) {

					double dist = point[c].calDistance(point[v]);
					System.out.println("Distance is: " + dist);
				}

				break;
			case 10:
				quite = true;

				break;
			default:
				System.out.println("Wrong input");

			}

		} while (!quite);

		sc.close();

	}

}
