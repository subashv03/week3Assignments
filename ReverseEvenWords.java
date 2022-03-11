package assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester basically";
		String[] splitText = test.split(" ");
		for (int i = 0; i < splitText.length; i++) {
			if (i % 2 == 1) {
				String rev = "";
//				String revText = splitText[i];
				char[] revText = splitText[i].toCharArray();
				for (int j = revText.length-1; j >= 0; j--) {
					rev += revText[j];
					
				}System.out.print(rev+ " ");
			} else {
				System.out.print(splitText[i]+ " ");
			}
		}

	}
}
