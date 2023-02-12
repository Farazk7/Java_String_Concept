package String;

public class Unique_Characters {
	static String str = "abcdefgghh";

	public static void main(String[] args) {
		Unique_Characters u = new Unique_Characters();
		u.uniqueCharacters(str);

		if (u.uniqueCharacters(str)) {
			System.out.println("String  contains all the special  characters");
		} else {
			System.out.println("String  contains doesn't the special  characters");
		}
	}

	public Boolean uniqueCharacters(String str) {
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		return true;

	}
}
