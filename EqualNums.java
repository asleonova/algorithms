import java.util.*;
public class EqualNums {

	public static int[] digitCount(int num) {
		int[] digitCount = new int[10];
		while (num > 0) {
			int lastDigit = num % 10;
			digitCount[lastDigit] += 1;
			num = num / 10;
		}
		return digitCount;

	}

	public static boolean equalNums(int x, int y) {
		boolean res = true;
	
		int[] dx = digitCount(x);
		int[] dy = digitCount(y);
		for (int i = 0; i < 10; ++i) {
			if (dx[i] != dy[i])
				return false;
		}
		return res;
	}

	public static void main(String [] args) {
		int x = 202010367;
		int y = 120200673;

		boolean res = equalNums(x, y);
		System.out.println(res);
	}
}