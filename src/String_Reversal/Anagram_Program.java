package String_Reversal;

import java.util.Arrays;

public class Anagram_Program {
static String s1 = "School Master";
static String s2 = "The Classroom";
public static void main(String[] args) {
	if (s1.contains(" ") && s2.contains(" ")) {
		s1= s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		s1 =s1.toLowerCase();
		s2 =s2.toLowerCase();
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("They are an Anagram Strings");
		
		}
		else {
			System.out.println("They are not an Anagram String");
		}
	}
	else {
		s1= s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		s1 =s1.toLowerCase();
		s2 =s2.toLowerCase();
		char c3[] = s1.toCharArray();
		char c4[] = s2.toCharArray();
		Arrays.sort(c3);
		Arrays.sort(c4);
		if (Arrays.equals(c3, c4)) {
			System.out.println("They are an Anagram Strings");
		
		}
		else {
			System.out.println("They are not an Anagram String");
		}
	}
}
}
