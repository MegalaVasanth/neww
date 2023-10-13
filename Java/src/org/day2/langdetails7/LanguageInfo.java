package org.day2.langdetails7;

public class LanguageInfo extends StateDetails{
	private void tamilLanguage() {
		System.out.println("Tamil Language");
	}

	private void englishLanguage() {
		System.out.println("English Language");
	}

	private void hindiLanguage() {
		System.out.println("Hindi Language");
	}
	public static void main(String[] args) {
		LanguageInfo lan = new LanguageInfo();
		lan.tamilLanguage();
		lan.englishLanguage();
		lan.hindiLanguage();
		
		lan.southIndia();
		lan.northIndia();
	}
}
