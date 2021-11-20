package Fruits;

public class Mango extends Fruit {
	
	private String taste;
	

	public Mango(String fruitName, int quantity, String sweet) {
		// TODO Auto-generated constructor stub
		super(fruitName,quantity);
		System.out.println("in Mango constr");
		
				this.taste=sweet;
		
	}public String taste() {
		return "Fruit " +super.taste()+"=quantity, taste is "+taste+".";
	}

}
