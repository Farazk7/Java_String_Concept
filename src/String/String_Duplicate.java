package String;

import java.util.Arrays;

public class String_Duplicate {
	public static void removeDuplicates(char s[], int n)
    {
        String s1="";
        Arrays.sort(s);           // Sort the string
        int i,j;
        s1+=s[0];
        for(i=1;i<n;i++){
            if(s[i]!=s[i-1]){     // If the previous element is not same as current, then add it to the    
                s1+=s[i];        // answer because it the the first occurence of this character
            }
        }
        System.out.print(s1);
    }
    public static void main(String[] args)
    {
    	String str = "Faraz";
        char s[] = str.toCharArray();
        int n = s.length;
        removeDuplicates(s, n);
    }

}
