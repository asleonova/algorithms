import java.util.ArrayList;
import java.util.HashSet;


public class findWordsInDict {

    public static ArrayList<String> find(ArrayList<String> dict, ArrayList<String> text) {
        
        ArrayList<String> ret = new ArrayList<>();
        
        HashSet<String> set = new HashSet<>();
        set.addAll(dict);
        for (String word : dict)  {
            // for (char c: word.toCharArray()) {
            //     String strNew = word.replace(String.valueOf(c), "");
            //     set.add(strNew);
            // }
            for (int i = 0; i < word.length(); ++i) {
                StringBuffer stringBuffer = new StringBuffer(word);
                stringBuffer.delete(i, i + 1);
                set.add(stringBuffer.toString());
                System.out.println(stringBuffer.toString());
            }

        }

        for (String words : text) {
            if (set.contains(words))
                ret.add(words);
        }    
        return ret;

    

    }
    public static void main(String[] args) {
        ArrayList<String> dict = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();
        ArrayList<String> ret;

        dict.add("hello");
        dict.add("world");
        dict.add("anna");
        dict.add("good");
        dict.add("luck");

        text.add("helo");
        text.add("orld");
        text.add("ann");
        text.add("god");
        text.add("luk");

        ret = find(dict, text);
        System.out.println(ret);

        
    }
}