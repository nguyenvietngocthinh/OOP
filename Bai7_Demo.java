package bai7;

public class Bai7_Demo {
	public static void main(String[] args) {
		Bai7_ToaDo toaDo1 = new Bai7_ToaDo("O",5,5);
		Bai7_HinhTron hinhTron1 = new Bai7_HinhTron(toaDo1, 10.5);
		
		System.out.println(hinhTron1);
		
		System.out.println("Chu vi hinh tron: "+ hinhTron1.tinhChuVi());
		
		
		System.out.println("Dien tich hinh tron: " + hinhTron1.tinhDienTich());
		
	}
}
