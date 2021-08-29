public class findMinEvenNum {

    public static int findMin(int[] arr) {
        int x = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0 && x == -1) {
                x = arr[i];
            }
            if (arr[i] % 2 == 0 && x != -1 && arr[i] < x) {
                x = arr[i];
            } 
        }
        if (x != -1)
            return x;
        else 
            return 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 4, 5, 6, 2};
        int x = findMin(arr);
        System.out.println(x);
    }
}