
public class CommandTest {

	public static void main(String[] args) {
		Stock itemStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(itemStock);
		SellStock sellStockOrder = new SellStock(itemStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();

	}

}
