package String;

import java.util.Scanner;

public class User_Input {
public static void main(String[] args) {
	System.out.println("Please enter the String");
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	System.out.println("User Entered the string as : " + s1);
}
}
