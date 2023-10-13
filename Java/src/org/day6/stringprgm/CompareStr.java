package org.day6.stringprgm;
import java.util.Scanner;

// QUESTION 10
public class CompareStr {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		// QUESTION 11.1
//		String s1 = "hi";
//		String s2 = "hi";
//		int identityHashCode = System.identityHashCode(s1);
//		int identityHashCode2 = System.identityHashCode(s2);
//		System.out.println("s1-->" + identityHashCode);
//		System.out.println("s2-->" + identityHashCode2);
//
//		// QUESTION 11.2
//		String nonlit1 = new String("megala");
//		String nonlit2 = new String("megala");
//QUESTION 10
//		int identityHashCodenl = System.identityHashCode(nonlit1);
//		int identityHashCodenl2 = System.identityHashCode(nonlit2);
//		System.out.println("nonstr1-->" + identityHashCodenl);
//		System.out.println("nonstr2-->" + identityHashCodenl2);
//
//		System.out.println("Enter String one:");
//		String str1 = sobj.nextLine();
//
//		System.out.println("Enter String two:");
//		String str2 = sobj.nextLine();
//
//		// int compareTo = str1.compareTo(str2);
//		if (str1.compareToIgnoreCase(str2) == 0 || str1.compareTo(str2) == 0) {
//			System.out.println("Strings are Equal");
//
//		} else {
//			System.out.println("Strings are not Equal");
//		}

////QUESTION 12
//		System.out.println("--------------------------------------");
//		System.out.println("Enter a string...");
//		String split1 = sobj.nextLine();
//		String[] split = split1.split(" ");
//		for (String string : split) {
//			System.out.println(string);
//
//		}
//		System.out.println("--------------------------------------");
//		String[] split2 = split1.split("l");
//		for (String string : split2) {
//			System.out.println(string);
//
//		}

//QUESTION 13
//		System.out.println("-------------------------------------------");
//		System.out.println("Enter a string to substring...");
//		String substr = sobj.nextLine();
//		int indexOfspc = substr.indexOf(" ");
//		 String substring = substr.substring(0, indexOfspc);
//		System.out.println(substring);
//		sobj.close();
//	}
//QUESTION 14
//		System.out.println("-------------------------------------------------");
//		System.out.println("Enter a String to find Consonant and vowels:");
//		String cv = sobj.nextLine();
//		char[] chr = cv.toCharArray();
//		int conCount = 0;
//		int vovCount = 0;
//		StringBuffer vowbuf = new StringBuffer("");
//		StringBuffer conbuf = new StringBuffer("");
//
//		for (int i = 0; i < chr.length; i++) {
//
//			// System.out.println(chr[i]);
//			if (chr[i] == 'A' || chr[i] == 'E' || chr[i] == 'I' || chr[i] == 'O' || chr[i] == 'U' || chr[i] == 'a'
//					|| chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
//				vowbuf = vowbuf.append(chr[i]);
//				vovCount++;
//
//			} else {
//				conbuf = conbuf.append(chr[i]);
//				conCount++;
//			}
//
//		}
//		System.out.println("Consonanat Count:" + conCount + " Consonant are:" + conbuf);
//		System.out.println("Vowels Count:" + vovCount + " Vowels are:" + vowbuf);
//QUESTIO-16  
		// replaceAll
//		System.out.println("------------------------------------------");
//		String replaceAll = cv.replaceAll("[aeiouAEIOU]", "@");
//		System.out.println(cv+"--->"+replaceAll);

		
//QUESTION -15
		System.out.println("Enter a Sentance:");
		String combination = sobj.nextLine();
		char[] comb = combination.toCharArray();
		int capsCount=0,smallCount=0,numCount=0,spclCount=0;
		
		for (int i = 0; i < comb.length; i++) {
			
			if(Character.isUpperCase(comb[i])){
				capsCount++;
			}else if(Character.isLowerCase(comb[i]))
			{
				smallCount++;
				
			}else if(Character.isDigit(comb[i])) {
				numCount++;
				
			}else if(!Character.isSpace(comb[i]))
			{
				spclCount++;
			}
			
		}
		System.out.println("caps Count:"+capsCount);
		System.out.println("small Count:"+smallCount);
		System.out.println("number Count:"+numCount);
		System.out.println("special Count:"+spclCount);
		sobj.close();
	}

}
