import java.util.Arrays;

public class findSumV1 {

    public static int[] findSum(int[] arr, int x) {
        int[] res = new int[2];
        for (int i = 0; i < arr.length; ++i) {
            int j = i + 1;
            for (; j < arr.length; ++j) {
                if (arr[i] + arr[j] == x) {
                    res[0] = arr[i];
                    System.out.println("res 0: " + res[0]);
                    res[1] = arr[j];
                    System.out.println("res 1: " + res[1]);
                    return res;
                }
            }
        }
        res[0] = 0;
        res[1] = 0;
        return res;
    } 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 5;
        int[] res = findSum(arr, x);
        System.out.println("res is: " + Arrays.toString(res));
    }
}