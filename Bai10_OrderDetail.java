package bai10;

public class Bai10_OrderDetail {
	private int quantity;
	private Bai10_Product product;
	
	
	public Bai10_OrderDetail() {

	}


	public Bai10_OrderDetail(int quantity, Bai10_Product product) {
		this.quantity = quantity;
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Bai10_Product getProduct() {
		return product;
	}


	public void setProduct(Bai10_Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "OrderDetail [quantity=" + quantity + ", product=" + product + "]"+"\n";
	}


	
	
}