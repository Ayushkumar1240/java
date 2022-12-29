//import javax.lang.model.util.ElementScanner14;

public class findpair {
    static boolean search(int arr[], int n, int key) {
        int l = 0;
        int h = n - 1;
        while (l < h) {
            if (arr[l] + arr[h] == key) {
                return true;
            } else if (arr[l] + arr[h] < key) {

                l++;

            } else {
                h--;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 4, 6, 7, 8, 9 };
        int n = arr.length;
        int key = 10;
        boolean i = search(arr, n, key);
        System.out.println(i);
    }
}
