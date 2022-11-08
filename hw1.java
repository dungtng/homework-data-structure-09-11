package hw10;

import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;

public class hw1 {

	public static void main(String[] args) {
		List<Integer> inputin = new ArrayList<Integer>(asList(1, 3, 5, 3));
		int mingap = minimumGap(inputin);
		System.out.println("gap " + mingap);
	}

	public static int minimumGap(List<Integer> inputarr) {
		int mingap = inputarr.size() - 1;
		int gap = 0;
		for (int i = 0; i < inputarr.size(); i++) {
			int tempNum = inputarr.get(i);
			for (int j = 0; j < inputarr.size(); j++) {
				if (tempNum == inputarr.get(j) & i != j) {
					gap = Math.abs(j - i);
				}
				if (mingap > gap & gap != 0) {
					mingap = gap;
				}
			}
		}
		if (gap == 0) {
			mingap = gap;
		}
		return mingap;
	}
}
