package management;

public enum CustomerType {
	SILVER,GOLD,PLATINUM;
	
	@Override
	public String toString() {
		return "Customer Type"+name().toUpperCase();
	}
	
}
