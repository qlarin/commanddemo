
public class Stock {

	private String name = "item";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("Stock [ " + name + ", quantity: " + quantity + " ] bought");
	}
	
	public void sell(){

		System.out.println("Stock [ " + name + ", quantity: " + quantity + " ] sold");
	}
}
