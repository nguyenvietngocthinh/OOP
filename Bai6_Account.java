package bai6;

public class Bai6_Account {
	private long accountNumbet;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	
	public Bai6_Account(long accountNumbet, String name, double balance) {
		super();
		this.accountNumbet = accountNumbet;
		this.name = name;
		this.balance = balance;
	}
	
	public Bai6_Account() {
		super();
	}

	public long getAccountNumbet() {
		return accountNumbet;
	}

	public void setAccountNumbet(long accountNumbet) {
		this.accountNumbet = accountNumbet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRATE() {
		return RATE;
	}
	
	public boolean deposit(double amount) {
		
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Gui tien thanh cong");
			System.out.println(balance);
			return true;
		}else {
			System.out.println("Gui tien thaat bai");
			System.out.println(balance);
			return false;
		}
		
	}
	
	public boolean withdraw(double amount, double fee) {
		
		if(amount > 0 || amount+fee <= balance) {
			balance = balance - (amount+fee);
			System.out.println("Rut tien thanh cong");
			System.out.println(balance);
			return true;
		}else {
			System.out.println("Rut tien that bai");
			System.out.println(balance);
			return false;
		}
		
	}	
	
	public double addInterest() {
		System.out.println("Tien  lai");
		return balance + balance * RATE;
	}

		
		public boolean transfer(Bai6_Account account, double amount) {
			double	balance2 = account.getBalance();
			if(amount > 0) {
				balance = balance - amount;
				balance2 =  balance2 + amount;
				account.setBalance(balance2);
				System.out.println("Gui tien thanh cong");
				return true;
			}else {
				System.out.println("Gui tien khong thanh cong");
				return false;
			}
			
		}
	

	@Override
	public String toString() {
		return "Account [accountNumbet=" + accountNumbet + ", name=" + name + ", balance=" + balance + ", RATE=" + RATE
				+ "]";
	}
	
	
}
