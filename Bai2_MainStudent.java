package Bai2_SinhVien;

public class Bai2_MainStudent {
	public static void main(String[] args) {
		Bai2_Student student = new Bai2_Student(-1, "Thinh", 10, 10);
		Bai2_Student student2 = new Bai2_Student(2, "Bao", 5, 5);
	
	
	
		System.out.println(student);
		System.out.println("sv1: "+ student.ave());
		System.out.println(student2);
		System.out.println("sv2: "+ student2.ave());
		
	}
}
