package String;

public class Demo1 {
public static void main(String[] args) {
	
	String brand = "Louis Vuitton";
String brand1 = brand.concat(" Delhi ");
System.out.println(brand);
System.out.println(brand1);

StringBuilder brand2 = new StringBuilder("Burberry London");
brand2.append(" London ");
System.out.println(brand2);

String s3 = "pw";
String s4 = "pw";

String s5 = new String("pw");
String s6 = new String ("pw");

System.out.println(s3==s4);
System.out.println(s5==s6);

}


}
