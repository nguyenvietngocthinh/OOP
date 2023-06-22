package bai9;

public class Bai9_DemoTinhLuong {
	public static void main(String[] args) {
		Bai9_CongNhan congNhan1 = new Bai9_CongNhan(1, "Nguyen", "Thinh", 100);
		Bai9_CongNhan congNhan2 = new Bai9_CongNhan(2, "Tran", "Thuy", 300);
		Bai9_CongNhan congNhan3 = new Bai9_CongNhan(3, "Nguyen", "Bao", 500);
		Bai9_CongNhan congNhan4 = new Bai9_CongNhan(4, "Nguyen", "Dien", 700);
		
		System.out.println(congNhan1);
		System.out.println(congNhan1.tinhLuong());
		System.out.println(congNhan2);
		System.out.println(congNhan2.tinhLuong());
		System.out.println(congNhan3);
		System.out.println(congNhan3.tinhLuong());
		System.out.println(congNhan4);
		System.out.println(congNhan4.tinhLuong());
	}
}
