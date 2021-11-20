package testerfruit;

import java.util.Scanner;
import Fruits.Fruit;
import Fruits.Apple;
import Fruits.Mango;
import Fruits.Orange;
public class TestFruit {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	Fruit[] logic= new Fruit[sc.nextInt()];
	boolean exit = false;
	int counter = 0;
	while(!exit) {
		System.out.println("1. Add Apple 2. Add Mango 3. Add Orange 4.Display all 10. Exit");
		System.out.println("Choose");
		switch (sc.nextInt()) {
		
		case 1://Apple
			if (counter < logic.length) {
				System.out.println("Enter detail : fruitName,quantity, taste");
				logic[counter++]=new Apple(sc.next(), sc.nextInt(), sc.next());
			}
			
			else
				System.out.println("Basket full");
			break;
		
		case 2: //Mango
			if(counter < logic.length) {
				System.out.println("Enter details : fruitName, quantity, taste");
				logic[counter++]=(Fruit) new Mango(sc.next(), sc.nextInt(), sc.next());
			}else
				System.out.println("Basket full");
			break;
			
		case 3://Orange
			if(counter< logic.length) {
				System.out.println("Enter details : fruitName, quantity, taste");
				logic[counter++]=new Orange(sc.next(), sc.nextInt(), sc.next());
			}else
				System.out.println("Basket full");
			break;
		case 4://display
			System.out.println("Details entered");
			//for each
			for(Fruit f: logic)
				if(f !=null)
					System.out.println(f);
			break;
		case 10: //exit
			exit = true;
			System.out.println("You are out of the Fruitbasket");
			break;
		
		
		}
		
	}
	sc.close();
	
	}

}
