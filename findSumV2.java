import java.util.*;
public class findSumV2 {

	public static int[] findSum(int[] arr, int x) {
		HashSet<Integer> set = new HashSet<>();
		int[] res = new int[2];
		// for (int i = 0; i < arr.length; ++i) {
		// 	set.add(arr[i]);
		// }
		for (int j = 0; j < arr.length; ++j) {
			if (set.contains(x - arr[j])) {
				res[0] = arr[j];
				res[1] = x - arr[j];
				return res;
			}
			set.add(arr[j]);
		}
		res[0] = 0;
		res[1] = 0;
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int x = 7;
		int[] res = findSum(arr, x);
		System.out.println("res is: " + Arrays.toString(res));
	    }
}