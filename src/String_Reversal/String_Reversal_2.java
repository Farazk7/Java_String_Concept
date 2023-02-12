package String_Reversal;

public class String_Reversal_2 {
public static void main(String[] args) {
	String s1 = "PWSkills Java";
	String s2 = "";
	String[] split = s1.split(" ");
	for(int i=split.length-1 ; i>=0; i--) {
		s2 = s2 + split[i] + " "; 
	}
	System.out.println(s2);
}
}
