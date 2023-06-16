package Bai2_SinhVien;

public class Bai2_Student {
	private int mssv;
	private String name;
	private double gradeLT;
	private double gradeTH;
	public Bai2_Student() {
		super();
	}
	public Bai2_Student(int mssv, String name, double gradeLT, double gradeTH) {
		super();
		if(mssv <= 0 ) {
			this.mssv = 0;
		}else {
			this.mssv = mssv;
		}	
		this.name = name;
		this.gradeLT = gradeLT;
		this.gradeTH = gradeTH;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		if(mssv <= 0 ) {
			this.mssv = 0;
			System.out.println("Nhap loi");
		}else {
			this.mssv = mssv;
		}	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == "") {
			System.out.println("Nhap loi");
		}else {
			this.name = name;
		}
		
	}
	public double getGradeLT() {
		return gradeLT;
	}
	public void setGradeLT(double gradeLT) {
		if(gradeLT < 0 || gradeLT > 10 ) {
			this.gradeLT = 0;
			System.out.println("Nhap loi");
		}else {
			this.gradeLT = gradeLT;
		}	
		
	}
	public double getGradeTH() {
		return gradeTH;
	}
	public void setGradeTH(double gradeTH) {
		if(gradeTH < 0 || gradeTH > 10 ) {
			this.gradeTH = 0;
			System.out.println("Nhap loi");
		}else {
			this.gradeTH = gradeTH;
		}	
	}
	
	public double ave() {
		return (gradeLT + gradeTH)/2;
	}
	
	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", name=" + name + ", gradeLT=" + gradeLT + ", gradeTH=" + gradeTH + "]";
	}

	
}
