import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentSymbol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Character ret = 'a';
        Integer max = 0;

        TreeMap<Character, Integer> map = new TreeMap<>();


        for (Character c : str.toCharArray()) {
            Integer count = map.get(c);
            if (count == null) {
                map.put(c, 1);
            } else {
                map.put(c, count + 1);
            }
        }
        for (
                Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer val = entry.getValue();
            if (val > max) {
                ret = entry.getKey();
                max = val;
            }

        }
        System.out.println(ret);
    }

}
