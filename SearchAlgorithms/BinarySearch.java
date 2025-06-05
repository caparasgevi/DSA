import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int key){
        if(right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } if (arr[mid] > key){
                return binarySearch(arr, left, right - 1, key);
            }
            return binarySearch(arr, left + 1, right, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100, 90, 40, 70, 60, 50, 30, 20, 10, 80};
        int key = 90;
        Arrays.sort(arr);
        System.out.println("Binary Search: " + binarySearch(arr, 0, arr.length-1, key));
    }
}
