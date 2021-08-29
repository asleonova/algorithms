public class findXLast {

    public static int func(int [] arr, int x) {
        int res = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (x == arr[i])
               res = arr[i];
                  
        }
        return res;
    }
    public static void main(String [] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = func (arr, 5);
        System.out.println(res);

    }
}