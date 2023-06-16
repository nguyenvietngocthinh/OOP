package bai6;

public class Bai6_Demo {
	public static void main(String[] args) {
		Bai6_Account account = new Bai6_Account(72354,"Ted Murphy", 102.56);
		Bai6_Account account2 = new Bai6_Account(69713,"Jane Smith", 40.00);
		
		// Nop tien	thanh cong	
//		account.deposit(100);
		
		// Nop tien	that bai	
//		account.deposit(-100);
			
		// Rut tien thanh cong
//		account.withdraw(100, 1);
		
		// Rut tien that bai
//		account.withdraw(-100, 1);
		
		// Tien lai
//		System.out.println(account.addInterest());
		
		
		//gui tien
		System.out.println(account);
		System.out.println(account2);
		
		account.transfer(account2, 100);
		
		System.out.println(account);
		System.out.println(account2);
	}
}
