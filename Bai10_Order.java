package bai10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Bai10_Order {
	private int orderID;
	private LocalDate orderDate;
	private ArrayList<Bai10_OrderDetail> lineItems = new ArrayList<Bai10_OrderDetail>();
	private int count;

	
	
	public Bai10_Order() {
	}

	


	public Bai10_Order(int orderID, LocalDate orderDate) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
	}




	public Bai10_Order(int orderID, LocalDate orderDate, ArrayList<Bai10_OrderDetail> lineItems, int count) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.lineItems = lineItems;
		this.count = count;
	}

		
	
	public int getOrderID() {
		return orderID;
	}



	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}



	public LocalDate getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}



	public ArrayList<Bai10_OrderDetail> getLineItems() {
		return lineItems;
	}



	public void setLineItems(ArrayList<Bai10_OrderDetail> lineItems) {
		this.lineItems = lineItems;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}


	// add
	public void addLineitem(Bai10_Product p, int x) {
		lineItems.add(new Bai10_OrderDetail(x,p));
		double sum;
		sum = p.getPrice() * x;
		count += sum;
	}
	

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderDate=" + orderDate +"\n"+  ", lineItems=" + lineItems +", count="
				+ count + "]";
	}



	
	
}