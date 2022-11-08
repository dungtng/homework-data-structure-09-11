package hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thefeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Total test cases: ");
		int totalTests = in.nextInt();
		List<int[]> testcases = new ArrayList<int[]>();
		boolean isFinish = false;
		int index = 0;
		int bars = 0;
		while (!isFinish) {
			System.out.println("testcase " + totalTests);
			int[] testcase = new int[3];
			testcases.add(testcase);
			for (int i = 0; i < 3; i++) {
				int inNum = in.nextInt();
				testcase[i] = inNum;
			}
			System.out.println("-");
			bars = theFeast(testcases.get(index));
			System.out.println("The total bars is " + bars);
			index++;
			totalTests--;
			if (totalTests == 0) {
				isFinish = true;
			}
		}
	}

	public static int theFeast(int[] testcase) {
		int totalBars = testcase[0] / testcase[1];
		int totalWrappers = totalBars;
		while (totalWrappers > 1) {
			int barsAfterSwap = totalWrappers / testcase[2];
			if (barsAfterSwap != 0) {
				totalWrappers = barsAfterSwap + totalWrappers % testcase[2];
				totalBars = totalBars + barsAfterSwap;
			} else {
				return totalBars;
			}
		}
		return totalBars;
	}
}
