class array {
    public static void leftRotate(int arr[], int d) {
        if (d == 0)
            return;
        int n = arr.length;
        d = d % n;
        revArrary(arr, 0, d - 1);
        revArrary(arr, d, n - 1);
        revArrary(arr, 0, n - 1);

    }

    public static void revArrary(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        leftRotate(arr, d);
        printArray(arr);
    }
}