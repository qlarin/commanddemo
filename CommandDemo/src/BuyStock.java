
public class BuyStock implements Order{

	private Stock itemStock;
	
	public BuyStock(Stock itemStock){
		this.itemStock = itemStock;
	}
	
	public void execute(){
		itemStock.buy();
	}
}
