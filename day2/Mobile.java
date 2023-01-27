package week1.day2;

public class Mobile {
	public void mobileBrand() {
		String mobileBrandName="Motorola";
		System.out.println("Mobile Brand Name = "+mobileBrandName);
	}
	public void logo() {
		char mobileLogo='M';
		System.out.println("Mobile Logo = "+mobileLogo);
	}
	public void mobilePiece() {
		short noOfMobilePiece=5;
		System.out.println("Number Of Mobile Piece = "+noOfMobilePiece);
	}
	public void modelNumber() {
		int modelNumber=9;
		System.out.println("Model Number = "+modelNumber);
	}
	public void lemiNumber() {
		long mobileLmeiNumber=234567343556752L;
		System.out.println("Mobile Lmei Number = "+mobileLmeiNumber);
	}
	public void mobilePrice() {
		float mobilePrice=13.5F;
		System.out.println("Mobile Price = "+mobilePrice);
	}
	public void Damaged() {
		boolean isDamaged=false;
		System.out.println("It Is Damaged = "+isDamaged);
	}

	public static void main(String[] args) {
		Mobile ob = new Mobile();
		ob.mobileBrand();
		ob.logo();
		ob.mobilePiece();
		ob.modelNumber();
		ob.lemiNumber();
		ob.mobilePrice();
		ob.Damaged();
		
	}
	
}
