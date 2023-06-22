package bai9;

public class Bai9_CongNhan {
	private int maCn;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	
	public Bai9_CongNhan() {

	}


	public Bai9_CongNhan(int maCn, String mHo, String mTen, int mSoSP) {
		this.maCn = maCn;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}


	public int getMaCn() {
		return maCn;
	}


	public void setMaCn(int maCn) {
		this.maCn = maCn;
	}


	public String getmHo() {
		return mHo;
	}


	public void setmHo(String mHo) {
		this.mHo = mHo;
	}


	public String getmTen() {
		return mTen;
	}


	public void setmTen(String mTen) {
		this.mTen = mTen;
	}


	public int getmSoSP() {
		return mSoSP;
	}


	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}

	public double tinhLuong() {
		double tinhLuong;
		if(mSoSP > 0 && mSoSP<= 199) {
			 tinhLuong = 0.5 * mSoSP;
		}else if(mSoSP >= 200 && mSoSP <=399) {
			tinhLuong = 0.55 * mSoSP;
		}else if(mSoSP >= 400 && mSoSP <=599) {
			tinhLuong = 0.6 * mSoSP;
		}else {
			tinhLuong = 0.65 * mSoSP;
		}
		return tinhLuong;
	}
	
	public void hienThiCongNhan() {
		System.out.printf(" %-10d %-10s %-10s %-10d \n", maCn, mHo, mTen, mSoSP);
	}

	@Override
	public String toString() {
		return "CongNhan [maCn=" + maCn + ", mHo=" + mHo + ", mTen=" + mTen + ", mSoSP=" + mSoSP + "]";
	}
	
	
}
