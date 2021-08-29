public class Rle {

    public static String count(char lastSymbol, int i) {
        String s = new String();

        if (i > 1) {
            s = String.valueOf(lastSymbol) + i;
        }
        return s;
    }
    public static String rle(String str) {
       
        String ret = new String();
        char lastSymbol = str.charAt(0);
        int lastPos = 0;
        int i = 0;
        for (; i < str.length(); ++i) {
            if (lastSymbol != str.charAt(i)) {
                if (i - lastPos > 1)
                    ret += String.valueOf(lastSymbol) + (i - lastPos);
                else
                    ret += String.valueOf(lastSymbol);
                lastSymbol = str.charAt(i);
                lastPos = i;
        }
    }
        if (i - lastPos > 1)
            ret += String.valueOf(lastSymbol) + (i - lastPos);
         else
            ret += lastSymbol;
      return ret;
    }
    public static void main(String[] args) {
        String str = "AAABBBCCXYZDDDDEEEFFFAAAAAA";
        
        String res = rle(str);
        System.out.println(res);
    }
}