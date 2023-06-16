package Bai2_SinhVien;

import java.util.Scanner;

public class Bai2_MainStudentB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bai2_Student student = new Bai2_Student(-1, "Thinh", 10, 10);
		Bai2_Student student2 = new Bai2_Student(2, "Bao", 5, 5);
		
		
		System.out.println("Nhập sinh viên 3:");
		Bai2_Student student3 = new Bai2_Student();
		System.out.println("Nhập mssv(>0):");
		student3.setMssv(sc.nextInt()); 
		sc.nextLine();
		System.out.println("Nhập name:");
		student3.setName(sc.nextLine()); 
		System.out.println("Nhập gradeLT:");
		student3.setGradeTH(sc.nextDouble()); 
		System.out.println("Nhập gradeTH:");
		student3.setGradeLT(sc.nextDouble());
		
		System.out.println(student3);
	}
	
	
}
