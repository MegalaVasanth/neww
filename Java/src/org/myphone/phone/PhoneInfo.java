package org.myphone.phone;

public class PhoneInfo {
	private void phoneName() {
System.out.println("apple");
	}
	private void phoneMieiNum() {
System.out.println("IME3456789"); 
	}
	private void camera() {
System.out.println("20MP");
	}
private void storage() {
System.out.println("64GB");
}
private void osName() {
System.out.println("android");
}
	public static void main(String[] args) {
		PhoneInfo ph = new PhoneInfo()
;
		ph.phoneName();
		ph.phoneMieiNum();ph.camera();
		ph.storage();
		ph.osName();
	}

}
