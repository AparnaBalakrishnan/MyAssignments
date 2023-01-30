package week2.day1;

public class Calculator3 {
	public void addtionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println("Addtion Of Two Number = "+c);
		
	}
	public void subractionTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println("Subraction Of Two Number = "+g);
	}
	public void multipleTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println("Multiple Of Two Number = "+k);
	}
	public void divideTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println("Division Of Two Number = "+z);
	}
	public static void main(String[] args) {
		Calculator3 ob = new Calculator3();
		ob.addtionTwoNumber(25, 10);
		ob.subractionTwoNumber(20, 5);
		ob.multipleTwoNumber(3.6, 5.2);
		ob.divideTwoNumber(6.2F, 4.8F);
	}

}
