package Bai4;

public class Bai4_MainVehicle {
	public static void main(String[] args) {
		Bai4_Vehicle vehicle1 = new Bai4_Vehicle("Thinh", "Audi", 8000, 256);
		Bai4_Vehicle vehicle2 = new Bai4_Vehicle("Bao", "Toyota", 1000, 167);
		Bai4_Vehicle vehicle3 = new Bai4_Vehicle("Minh", "Ford", 2000, 202);

		
		vehicle1.tinhThue();
		vehicle2.tinhThue();
		vehicle3.tinhThue();
		
		
		
		System.out.printf("%5s %20s %10s %8s \n","Chủ xe","Dung tích","Trị giá","Thuế");
        vehicle1.inBang();
        vehicle2.inBang();
        vehicle3.inBang();
	}
}
