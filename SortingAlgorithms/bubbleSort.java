public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 4, 2, 1, 8, 3, 5};
        bubblesort(arr);
        for (int i : arr){
            System.out.print(i);
        }

    }
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    }