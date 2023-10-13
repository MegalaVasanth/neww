package org.lang;

public class StateDetails {
	private void southIndia() {
System.out.println("Tamil Language");
	}
	private void northIndia() {
System.out.println("Hindi Language");
	}
	public static void main(String[] args) {
		StateDetails st =new StateDetails();
		st.southIndia();
		st.northIndia();
		
		LanguageInfo lan = new LanguageInfo();
		lan.englishLanguage();
		lan.tamilLanguage();
		lan.hindiLanguage();
		
	}

}
