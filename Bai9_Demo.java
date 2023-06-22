package bai9;

import java.util.Scanner;


public class Bai9_Demo {
	static Scanner sc = new Scanner(System.in);
	public static void nhapCongNhan(Bai9_CongNhan cn) {
		System.out.print("Nhập mã công nhân: ");
        cn.setMaCn(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập họ công nhân : ");
        cn.setmHo(sc.nextLine());
        System.out.print("Nhập tên công nhân : ");
        cn.setmTen(sc.nextLine());
        System.out.print("Nhập số sản phẩm : ");
        cn.setmSoSP(sc.nextInt());
	}
	
	public static void main(String[] args) {
		Bai9_CongNhan cn[] = null;
		int a, n = 0;
		boolean flag = true;
		
		do {
			System.out.println("MENU");
			System.out.println("1. Nhập thông tin nhân viên");
			System.out.println("2. Hiện danh sách nhân viên");
			System.out.println("3. Tống số lượng nhân viên có trong danh sách");
			System.out.println("4. Những nhân viên có số lượng sản phẩm trên 200");
			System.out.println("5. Sắp xếp công nhân theo số lượng sản phẩm giảm dần");
			System.out.println("6. Nhập số khác để thoát");
			a = sc.nextInt();
			
			switch(a) {
				case 1:
					System.out.println("Nhập số lượng công nhân: ");
					n = sc.nextInt();
					cn = new Bai9_CongNhan[n];
					for(int i = 0; i < n; i++) {
						System.out.println("Công nhân thứ " + (i+1) + "=");
						cn[i] = new Bai9_CongNhan();
						nhapCongNhan(cn[i]);
					}
					break;
				case 2:
					System.out.printf(" %-10s %-10s %-10s %-10s \n", "Mã CN", "Họ CN", "Ten CN", "Số SP");
					for(int i = 0 ; i < n; i++) {
						cn[i].hienThiCongNhan();
					}
					break;
				case 3:
					System.out.println("Số lượng nhân viên có trong danh sách: " + n);
					break;
				case 4:
					for(int i = 0; i < n ; i++) {
						if (cn[i].getmSoSP() >= 200) {
							System.out.println(cn[i]);
						}
					}
					break;
				case 5:
					Bai9_CongNhan temp = cn[0];
					for(int i = 0; i < n - 1; i++) {
						for(int j = i+1; j<n; j++) {
							if(cn[i].getmSoSP() < cn[j].getmSoSP()) {
								temp = cn[j];
								cn[j] = cn[i];
								cn[i] = temp;
							}
						}
					}
					System.out.println("Sắp xếp thành công, nhấn lựa chọn 2 để kiểm tra");
					break;
				default:
					System.out.println("Goodbye");
                    flag = false;
					break;
			}
			
		}while(flag);
	}
}
