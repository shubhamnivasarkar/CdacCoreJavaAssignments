package Fruits;

public class Fruit {
	private String fruitName;
	private int quantity;
	public Fruit (String fruitName, int quantity) {
		
		System.out.println("in fruits constr");
		this.fruitName = fruitName;
		this.quantity=quantity;
		

	}
	public String taste() {
		return fruitName+" "+quantity;
	}

}
