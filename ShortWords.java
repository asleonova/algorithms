import java.util.ArrayList;

public class ShortWords {
    
    public static ArrayList<String> findShort(String[] words) {

        int minLen = words[0].length();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; ++i) {
            int wordLen = words[i].length();
            if (wordLen < minLen) {
                minLen = wordLen;
            }
        }
        for (int i = 0; i < words.length; ++i) {
            if (words[i].length() == minLen) {
                res.add(words[i]);
            }
        }
        return (res);

    }
    public static void main(String[] args) {
        String[] words = {"hello", "anna", "whats", "up", "dear", "ym"};

        ArrayList<String> res = findShort(words);
        System.out.println(res); 
    }
}