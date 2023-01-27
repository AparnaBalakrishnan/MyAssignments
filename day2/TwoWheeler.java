package week1.day2;

public class TwoWheeler {
	public void Wheels() {
		int noOfWheels=2;
		System.out.println("Number Of Wheels = "+noOfWheels);
	}
	public void Mirrors() {
		short noOfMirrors=2;
		System.out.println("Number Of Mirrors = "+noOfMirrors);
	}
	public void Chassis() {
		long chassisNumber=2325456345L;
		System.out.println("Chassis Number = "+chassisNumber);
	}
	public void Punctured() {
		boolean isPunctured=false;
		System.out.println("It Is Punctured = "+isPunctured);
	}
	public void bikeName() {
		String bikeName="TVS";
		System.out.println("Bike Name = "+bikeName);
	}
	public void runningKm() {
		double runningKm=2.5;
		System.out.println("Running Km = "+runningKm);
	}
	public static void main(String[] args) {
		TwoWheeler ob = new TwoWheeler();
		ob.Wheels();
		ob.Mirrors();
		ob.Chassis();
		ob.Punctured();
		ob.bikeName();
		ob.runningKm();	
	}

}
