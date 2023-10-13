package org.all;

import org.tamil.Tamil;

public class Languageclass extends Tamil{
	private void allLanguage() {
		System.out.println("Language Class -- MultiLevel Inheritance");
	}
	public static void main(String[] args) {
		Languageclass lan = new Languageclass();
		lan.allLanguage();
		lan.tamilLanguage();
		lan.englishLanguage();
		lan.teluguLanguage();
	}
}
