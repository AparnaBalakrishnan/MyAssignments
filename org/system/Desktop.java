package org.system;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Desktop Size : 15.6 inches");
	}
	public static void main(String[] args) {
		Desktop ob =new Desktop();
		ob.desktopSize();
		ob.computerModel();
		
	}

}
