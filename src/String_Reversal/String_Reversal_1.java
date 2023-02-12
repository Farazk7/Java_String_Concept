package String_Reversal;

public class String_Reversal_1 {
static String str1 = "PWSKILLS";
static String s2 = "";
public static void main(String[] args) {
	for(int i=str1.length()-1; i>=0; i--) {
		s2 = s2 + str1.charAt(i);
	
	}
	
	System.out.println("Before Reversing: " +str1);
	System.out.println("After Reversing: " +s2);
}
}
