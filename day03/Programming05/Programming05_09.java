package method;

public class Programming05_09 {
	public static void main(String[] args) {
		int m, n;
		double p;

		if (args.length >= 3) {
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
			p = Double.parseDouble(args[2]);
		} else {
			m = 5;
			n = 10;
			p = 0.3;
		}

		boolean[][] mine = new boolean[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				mine[i][j] = Math.random() < p;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print((mine[i][j] ? "*" : "-") + " ");
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mine[i][j])
					System.out.print("* ");
				else
					System.out.print(countNeighbors(mine, i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int countNeighbors(boolean[][] mine, int row, int col) {
		int count = 0;
		for (int i = row - 1; i <= row + 1; i++)
			for (int j = col - 1; j <= col + 1; j++)
				if (i >= 0 && i < mine.length && j >= 0 && j < mine[0].length && !(i == row && j == col))
					if (mine[i][j])
						count++;
		return count;
	}
}