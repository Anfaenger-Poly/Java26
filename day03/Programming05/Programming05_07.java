package method;

public class Programming05_07 {
	public static void main(String[] args) {
		int [] a = {3, 2, 4, 1, 5};
		int [] b = {3, 2, 4, 1};
		int [] c = {3, 2, 4, 1, 5};
		int [] d = {2, 7, 1, 8, 2};
		
		System.out.println("a and b : " + isEqual(a, b));
		System.out.println("a and c : " + isEqual(a, c));
		System.out.println("a and d : " + isEqual(a, d));
	}
	
	public static boolean isEqual(int[] x, int[] y) {
		if (x.length != y.length)
			return false;
		
		if (x.length == y.length) {
			for (int i = 0; i < x.length; i++)
				if (x[i] != y[i])
					return false;
			return true;			
		}
		return false;
	}
}
