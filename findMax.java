public class findMax {

    public static int func(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }  
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res = func(arr);
        System.out.println(res);
    }
}