package String;

import java.util.Arrays;

public class Count_String {
static String s1 = "Faraz%!*1234";
public static void main(String[] args) {
s1=	s1.toLowerCase();
	int vcount = 0 ; 
	int		ccount = 0;
	int scount = 0;
	int dcount =0;

	for (int i = 0 ; i<s1.length(); i++) {
		if (s1.charAt(i)=='a'|| s1.charAt(i)== 'e' || s1.charAt(i)== 'i' || s1.charAt(i)== 'o' || s1.charAt(i)== 'u' ) {
			vcount++;
		}
		
		else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
			ccount++;
		}
		
		else if (s1.charAt(i)>='0'&& s1.charAt(i)<='9') {
		dcount++;	
		}
		
		else {
			scount++;
		}
	}
System.out.println("number of vowels are : " + vcount);
System.out.println("number of consonants are : " + ccount);
System.out.println("number of digits are : " + dcount);
System.out.println("number of special Characters are : " + scount);
}
}
