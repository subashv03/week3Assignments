package assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "we learn java basics as part of java sessions in java week1";
		String[] splitText = text.split(" ");
		int count = 0;
		for (int i=0; i < splitText.length; i++) {
			for (int j=0; j < i; j++) {
				if (splitText[i].equals(splitText[j])) {
					count ++;
				}
			}
			if (count == 0) {
				System.out.print(splitText[i]+" ");
			} else{
				count=0;
			}
		}

	}
}

