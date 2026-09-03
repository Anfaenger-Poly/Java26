package method;

public class Programming05_06 {
	public static void main(String[] args) {
		
	}
	
	public static int[] reverse(int[] org) {
		int[] result = new int [org.length];
		
		for (int i = 0; i < org.length; i++) {
			result[i] = org[org.length -1 -i];
		}
		return result;
	}
}
