package Bai3;


public class Bai3_Triangle {
	private double ma;
	private double mb;
	private double mc;
	public Bai3_Triangle() {
		super();
	}
	public Bai3_Triangle(double ma, double mb, double mc) {
		super();
		if(ma < 0 || mb < 0 || mc < 0) {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else if(ma >= mb + mc || mb >= ma + mc || mc >= mb + ma) {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}else {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
		
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		if(ma < 0){
			this.ma = 0;
		}else{
			this.ma = ma;
		}
		
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		if(mb < 0){
			this.mb = 0;
		}else{
			this.mb = mb;
		}
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		if(mc < 0){
			this.mc = 0;
		}else{
			this.mc = mc;
		}
	}
	
	public double perimeterTriangle() {
		double p = 0;
		p = ma+mb+mc;
		return p;
		
	}
	
	
	public double acreageTriangle() {
		double result = 0;
		double p = 0;
		
		p = (ma+mb+mc)/2;
		
		result = Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
		
		return result;
		
	}
	
	public void testHinh() {
		if(ma == mb && ma == mc) {
			System.out.println("Đây là tam giác đều");
		}else if(ma == mb || ma == mc || mb == mc) {
			System.out.println("Đây là tam giác cân");
		}else {
			System.out.println("Đây là tam giác thường");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Triangle [ma=" + ma + ", mb=" + mb + ", mc=" + mc + "]";
	}
	
	
}
