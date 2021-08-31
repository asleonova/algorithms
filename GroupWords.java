import java.util.*;

public class GroupWords {

	public static String[][] groupWords(String[] words) {

	}

	public static void main(String [] args) {

		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

		String[][] newWords = groupWords(words);
		System.out.println(newWords);

	}
}

/* Time Complexity: O(NK \log K)O(NKlogK), where NN is the length of strs, and KK is the maximum length of a string in strs. The outer loop has complexity O(N)O(N) as we iterate through each string. Then, we sort each string in O(K \log K)O(KlogK) time.

Space Complexity: O(NK)O(NK), the total information content stored in ans.*/