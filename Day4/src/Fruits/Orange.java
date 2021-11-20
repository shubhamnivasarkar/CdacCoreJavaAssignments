package Fruits;

public class Orange extends Fruit {
	
	
	private String sore;
	

	public Orange(String fruitName, int quantity, String sore) {
		// TODO Auto-generated constructor stub
		super(fruitName,quantity);
		System.out.println("in Orange constr");
		
		this.sore=sore;
	}public String taste() {
		return "Fruit "+super.taste()+"=quantity,taste is "+sore+".";
	}

}
