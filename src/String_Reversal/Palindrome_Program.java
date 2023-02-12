package String_Reversal;

public class Palindrome_Program {
	static String s1 = "2552";
	static String s2 = "";
	public static void main(String[] args) {
		for(int i = s1.length()-1; i>=0; i--) {
			s2= s2 +s1.charAt(i);

		}
		if(s1.equals(s2)) {
			System.out.println("It is a palindrome string");
		}
		else {
			System.out.println("It is not  a palindrome String");
		}
	}
}
