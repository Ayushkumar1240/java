public class cyclicarray {
    static void reverse(int arr[]) {
        int x = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            arr[0] = x;

        }

    }

    public static void main(System args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        reverse(arr);
    }
}
