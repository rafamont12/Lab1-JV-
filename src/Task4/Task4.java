package Task4;

public class Task4 {
    public static void BubbleSort(int[] arr) {
        int N = arr.length;
        int temp;
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArray(arr);
    }

    public static void PrintArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 9, 6, 3, 1, 7, 2, 10 };
        System.out.println("Початковий масив: ");
        PrintArray(arr);
        System.out.println("Посортований масив: ");
        BubbleSort(arr);
    }
}
