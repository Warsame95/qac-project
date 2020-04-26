package dao;

public class Order {
	
	private int OrderId;
	private int CustomerId;
	private int ProductId;
	private int Quantity;
	private double Price;
	
	
	public Order (int OrderId, int CustomerId, int ProductId, int Quantity, double Price) {
		this.OrderId = OrderId;
		this.CustomerId = CustomerId;
		this.ProductId = ProductId;
		this.Quantity = Quantity;
		this.Price = Price;
	}


	public int getOrderId() {
		return OrderId;
	}


	public void setOrderId(int orderId) {
		OrderId = orderId;
	}


	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}


	public int getProductId() {
		return ProductId;
	}


	public void setProductId(int productId) {
		ProductId = productId;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}
	
	

}
