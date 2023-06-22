package bai10;

import java.time.LocalDate;

public class Bai10_Main {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2018,12,12);
		Bai10_Order order = new Bai10_Order(1, localDate);
		
		
		Bai10_Product product1 = new Bai10_Product("Nuoc Tuong", "sp4", 8000);
		Bai10_Product product2 = new Bai10_Product("Gao", "sp1", 18000);
		Bai10_Product product3 = new Bai10_Product("Duong", "sp3", 10000);
		Bai10_Product product4 = new Bai10_Product("Gao", "sp1", 18000);
		//OrderDetail orderDetail = new OrderDetail(10, product);
		
		order.addLineitem(product1, 10);
		order.addLineitem(product2, 5);
		order.addLineitem(product3, 1);
		order.addLineitem(product4, 1);
		
		System.out.println(order);
	}
}