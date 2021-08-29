public class findXFirst {

    public static int func(int [] arr, int x) {
        int min = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (min == -1 && x == arr[i])
                min = arr[i];
                  
        }
        return min;
    }
    public static void main(String [] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = func (arr, 5);
        System.out.println(res);

    }
}