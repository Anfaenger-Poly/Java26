package method;

public class Programming05_01 {
	public static void main(String[] args) {
		
	}
	static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				count++;
		return count;
	}
}
