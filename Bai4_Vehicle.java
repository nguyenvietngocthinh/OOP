package Bai4;

public class Bai4_Vehicle {
	private String chuXe;
	private String loaiXe;
	private double triGia;
	private int dungTich;
	public Bai4_Vehicle() {
		super();
	}
	public Bai4_Vehicle(String chuXe, String loaiXe, double triGia, int dungTich) {
		super();
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		if(triGia < 0) {
			System.out.println("Nhap loi");
			this.triGia = 0;
		}else {
			this.triGia = triGia;
		}
		
		if(dungTich < 0) {
			System.out.println("Nhap loi");
			this.dungTich = 0;
		}else {
			this.dungTich = dungTich;
		}
		
	}
	
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		if(triGia < 0) {
			System.out.println("Nhap loi");
			this.triGia = 0;
		}else {
			this.triGia = triGia;
		}
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		if(dungTich < 0) {
			System.out.println("Nhap loi");
			this.dungTich = 0;
		}else {
			this.dungTich = dungTich;
		}
	}
	
	public double tinhThue() {
		double thue = 0;
		if(dungTich < 100) {
			thue = triGia * 1 / 100;
		}else if(dungTich >=100 && dungTich <=200) {
			thue = triGia * 3 / 100;
		}else {
			thue = triGia * 5 / 100;
		}
		return thue;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [chuXe=" + chuXe + ", loaiXe=" + loaiXe + ", triGia=" + triGia + ", dungTich=" + dungTich + "]";
	}
	
	
	void inBang() {
		System.out.printf("%-20s %5d %10.2f %8.5f \n ",chuXe,dungTich,triGia,tinhThue());
	}
	
}
