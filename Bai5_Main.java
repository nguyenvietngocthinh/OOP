package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Bai5_Main {
	public static void main(String[] args){
		
		Bai5_HangThucPham hangThucPham = new Bai5_HangThucPham(1, "Gao", 100000, new Date(118,2,7), new Date(119,2,7));
		
		System.out.println(hangThucPham.toString());
		
		hangThucPham.kiemTraHSD();
	}
}
