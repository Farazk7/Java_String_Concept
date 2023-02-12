package String_Reversal;

public class Pangram_Program {
public static void main(String[] args) {
	Boolean flag = false;
	String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
	if (str.contains(" ")) {
		str = str.replace(" ", "");
		str = str.toLowerCase();// for upper case 65 and for lower case 97
		char ch[] = str.toCharArray();
	int ar[] = new int [26];
	for(int i = 0;i<ch.length;i++) {
		ar[ch[i]-97]++;
		
	}
	for (int i=0; i<ar.length;i++) {
		if (ar[i]==0) {
			System.out.println("It is not a pangram");
		flag=true;
		}
	}
	if (flag==false) {
		System.out.println("It is a pangram");
	}
	}
	
	else {
		str = str.toLowerCase();// for upper case 65 and for lower case 97
		char ch[] = str.toCharArray();
	int ar[] = new int [26];
	for(int i = 0;i<ch.length;i++) {
		ar[ch[i]-97]++;
		
	}
	for (int i=0; i<ar.length;i++) {
		if (ar[i]==0) {
			System.out.println("It is not a pangram");
		flag=true;
		break;
		}
	}
	if (flag==false) {
		System.out.println("It is a pangram");
	}
	}
	
	}
}

