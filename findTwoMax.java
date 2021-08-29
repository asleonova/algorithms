import java.util.ArrayList;
import java.lang.*;

public class findTwoMax {

    public static ArrayList<Integer> func(int[] arr) {
    int max = 0;
    int max2 = 0;
    ArrayList<Integer> newArr = new ArrayList<>();
    if (arr[0] > arr[1]) {
        max = arr[0];
        max2 = arr[1];
    }
    for (int i = 0; i < arr.length; ++i) {
        if (arr[i] > max) {
            max2 = max;
            max = arr[i];
        }
        else if (arr[i] > max2) {
            max2 = arr[i];
        }
    }
    newArr.add(max);
    newArr.add(max2);
    return (newArr);
}
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 9, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer>arrs = func(arr);
        System.out.println(arrs);
    }
}