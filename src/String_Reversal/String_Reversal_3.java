package String_Reversal;

public class String_Reversal_3 {
	static String str1 = "Think Twice";
	static String s2 = "";
	static String s4 = "";
	public static void main(String[] args) {
		str1 = str1.toLowerCase();
		for(int i=str1.length()-1; i>=0; i--) {
			s2 = s2 + str1.charAt(i);
		
		}
		String s3[] = s2.split(" ");
		for (int j = s3.length-1 ; j>=0 ; j--) {
			
			 s4 = s4 + s3[j] + " ";
		}
		
		System.out.println("Before Reversing: " +str1);
		//System.out.println("After Reversing: " +s2);
		System.out.println("Preserving the location: " + s4);
	}
}
