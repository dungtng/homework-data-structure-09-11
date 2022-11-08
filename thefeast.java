package hw10;

public class thefeast {

	public static void main(String[] args) {
		int n = 10;
		int c = 2;
		int m = 5;
		int bars = theFeast(n, c, m);
		System.out.println("The total bars is " + bars);
	}

	public static int theFeast(int n, int c, int m) {
		int totalBars = n / c;
		int totalWrappers = totalBars;
		int barsAfterSwap = 0;
		while (totalWrappers > 1) {
			barsAfterSwap = totalWrappers / m;
			totalWrappers = barsAfterSwap + totalWrappers % m;
			totalBars = totalBars + barsAfterSwap;
		}
		return totalBars;
	}
}
