public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == key) {
                System.out.println("Key " + key + " is found at index " + i);
                return i;
            }
        }
        System.out.println("Key " + key + " is not found in the array.");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 100;
        linearSearch(arr, key);
    }
}
