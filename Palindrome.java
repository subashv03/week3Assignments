package assignment;

public class Palindrome {

	public static void main(String[] args) {
    String value = "Madam";
	String rev = "";
	for(int i=value.length()-1; i>=0; i-- ) {
		rev += value.charAt(i);
	}
		if(value.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
	}
	
	

	}


