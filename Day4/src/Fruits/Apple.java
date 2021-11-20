package Fruits;

public class Apple extends Fruit {
	
	
	private String sweetandsore;
	
	public Apple(String fruitName, int quantity, String sweetandsore) {
		super(fruitName, quantity);
		// TODO Auto-generated constructor stub
		System.out.println("in Apple constr");
		
		this.sweetandsore=sweetandsore;
		
	}
	public String taste() {
		return "Fruit "+super.taste()+"=quantity, taste is "+sweetandsore+".";
		
	}

	

}
