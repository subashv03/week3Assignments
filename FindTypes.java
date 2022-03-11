package assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] arrTest = test.toCharArray();
		for(int i=0; i<arrTest.length; i++) {
			if(Character.isLetter(arrTest[i])) {
			letter++;
			}else if(Character.isDigit(arrTest[i])) {
				num++;
			}else if (Character.isSpaceChar(arrTest[i])) {
				space++;
			}else {
				specialChar++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
