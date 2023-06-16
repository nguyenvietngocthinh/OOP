package bai7;

public class Bai7_HinhTron {
	private Bai7_ToaDo tam;
	private double banKinh;
	private final double pi = 3.14;
	
	public Bai7_HinhTron() {
	}
	
	public Bai7_HinhTron(Bai7_ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public Bai7_ToaDo getTam() {
		return tam;
	}

	public void setTam(Bai7_ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi(){
		return banKinh * 2 * pi;
	}
	
	public double tinhDienTich(){
		return banKinh * banKinh * pi;
	}

	@Override
	public String toString() {
		return "HinhTron [tam=" + tam + ", banKinh=" + banKinh + "]";
	}
	
	
}
