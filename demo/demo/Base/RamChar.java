package demo.Base;

public class RamChar {
	public static char getRamdomCha(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static void main(String[] args) {
		final int NUM = 200;
		final int LINE = 20;
		char ch;
		for(int i = 0; i < NUM; i++) {
			ch = getRamdomCha('a', 'z');
			if ((i + 1) % LINE == 0)
				System.out.println(ch);
			else {
				System.out.print(ch);
			}
		}
	}
}
