package org.day2_coputer6;
public class Desktop extends Computer{
	private void desktopSize() {
		System.out.println("28 inches");
	}
	public static void main(String[] args) {
		Desktop ds = new Desktop();
		ds.computerModel();
		ds.desktopSize();
		
	}
}
