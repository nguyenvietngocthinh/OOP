package bai5;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Bai5_HangThucPham {
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nsx;
	private Date nhh;
	
	
	public Bai5_HangThucPham() {
		super();
	}

	public Bai5_HangThucPham(int maHang, String tenHang, double donGia, Date nsx, Date nhh) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.nsx = nsx;
		this.nhh = nhh;
	}
	
	

	public Bai5_HangThucPham(int maHang, String tenHang, double donGia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
	}

	public int getMaHang() {
		return maHang;
	}

	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Date getNsx() {
		return nsx;
	}

	public void setNsx(Date nsx) {
		this.nsx = nsx;
	}

	public Date getNhh() {
		return nhh;
	}

	public void setNhh(Date nhh) {
			this.nhh = nhh;		
	}
	
	
   
 


 
    @Override
	public String toString() {
    	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
         String str1 = simpleDateFormat.format(nsx);
         String str2 = simpleDateFormat.format(nhh);
		
	
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", nsx=" + str1
				+ ", nhh=" + str2 + "]";
	}

 
    //khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
    public boolean kiemTraNgay(boolean t) {
        if (this.getNsx().compareTo(this.getNhh()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
 
    //khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hạn hay còn hạn
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getNhh().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
}
