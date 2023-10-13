import java.util.Scanner;

public class FindReplace {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		// QUESTION 7.5:
//		System.out.println("Enter youre Address with Pincode");
//		String Address = sobj.nextLine();
//		// String Address="no:2,meganathan salai, pattur,pincode-456";
//		// System.out.println(Address);
//		// System.out.println("-----------------");
//		if (Address.contains("pincode")) {
//
//			String replace3 = Address.replace("pincode", "@");
//			// System.out.println(replace3);
//			String[] split = replace3.split("@");
//			for (String string1 : split) {
//
//				if (!string1.contains("-")) {
//					int lastIndexOf = string1.lastIndexOf(",");
//					String substring = string1.substring(0, lastIndexOf);
//					System.out.println(substring);
//				} else {
//					continue;
//				}
//
//			}
//		} else {
//			System.out.println("Invalid Address");
//		}
//		System.out.println("-----------------------------------------------------");

		// QUESTION 8

		System.out.println("--------------------------------------------------");
		
		// QUESTION 8.1
		/*System.out.println("Enter youre String in UpperCase");
		String strupper = sobj.nextLine();

		System.out.println(strupper.toLowerCase());
		System.out.println("---------------------------------------------------");

		System.out.println("Enter youre String in LowerCase");
		String strLower = sobj.nextLine();

		String upperCase = strLower.toUpperCase();
		System.out.println(upperCase);
*/		
		//System.out.println("---------------------------------------------------");
		//QUESTION 8.3
		System.out.println("Enter a string lower to upper case and viseversa:");
		String nextLine = sobj.nextLine();
		String lst = new String();
		int upcount=0,lpcount=0;
		char[] chr = nextLine.toCharArray();
		for (int i=0;i<chr.length;i++) {
			if(Character.isUpperCase(chr[i])) {
				chr[i] = Character.toLowerCase(chr[i]);
				upcount++;
			}
			else
			{
				chr[i] = Character.toUpperCase(chr[i]);
				//System.out.println(upperCase);
				lpcount++;
			}
		}

		String copyValueOf = lst.copyValueOf(chr);
		System.out.println(copyValueOf);
		//QUESTION 8.4
		System.out.println("UpperCase Count:"+upcount);
		System.out.println("LowerCase Count:"+lpcount);
		
		sobj.close();
	}

}
