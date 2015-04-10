
public class SellStock implements Order{

	private Stock itemStock;
	
	public SellStock(Stock itemStock){
		this.itemStock = itemStock;
	}
	
	public void execute(){
		itemStock.sell();
	}
}
