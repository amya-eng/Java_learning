package demo.Base;

import java.util.Scanner;

public class String_opera {
	public static void main(String[] args) {
		char ch = (int) 65.35; 
		System.out.println(ch);
		ch = (char)0xAB0041;  // The lower 16 bits hex code 
		System.out.println(ch);
		
		byte b = 'a';    // although 'a' is a char, but 97 is lower then 127
		System.out.println(b);
		
		int n = 'a';
		System.out.println(n);
		
		n = (int) (2 + 'a'); // 2 + 'a' == "2a"
		System.out.println(n);
		
		System.out.println(Character.isDigit(n));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isUpperCase(Character.toUpperCase(ch)));
		System.out.println(Character.toUpperCase(ch));
		
		System.out.println("\n\n");
		String s = "hello world!";
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		String s_ = " X .";
		System.out.println(s.concat(s_));
		System.out.println(s + s_);
		
		// string IO
		Scanner input = new Scanner(System.in);
		System.out.println("input two strings:");
		String s1 = input.next();    // whitespace end
		String s2 = input.next();
		System.out.println("they are:");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("\n\n");
		input = new Scanner(System.in);  //prevent reading the previous input's newline
		System.out.println("enter a character:");
		String s3 = input.nextLine();
		char c = s3.charAt(0);
		System.out.println("It's " + c);
		
		System.out.println("\n\n");
		String sa = "abcd";
		String sa_ = "ABcd";
		String sb = "abdc";
		String sc = "abc";
		System.out.println(sa.equals(sa_));   // false
		System.out.println(sa.equalsIgnoreCase(sa_));  //true
		
		System.out.println(sa.compareTo(sb));  // -1
		System.out.println(sa.compareToIgnoreCase(sa_)); // 0
		
		System.out.println(sb.startsWith("ab"));  // true
		System.out.println(sb.endsWith("dc"));  // true
		System.out.println(sa.contains(sc));  // true
		
		sa = "abcddd";
		System.out.println("\n\n");
		System.out.println("Welcome".substring(3,7)); // [3, 7) index  come
		System.out.println(sa.indexOf('a')); // 0
		System.out.println(sa.indexOf('d', 2)); // search after index 2.  3
		System.out.println(sa.indexOf("bc")); // 1
		System.out.println(sa.lastIndexOf('d')); // 5
		
		System.out.println("\n\n");
		// transfer string to number
		s1 = "123";
		s2 = "12.3";
		System.out.println(Integer.parseInt(s1));
		System.out.println(Double.parseDouble(s2));
		
		
		
		
		
	}
}
