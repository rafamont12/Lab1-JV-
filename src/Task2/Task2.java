package Task2;

public class Task2 {
    public static void SortByLength(String[] arr) {
        int N = arr.length;
        String temp;
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++) {
                if(arr[j].length() > arr[j + 1].length()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArray(arr);
    }

    public static void PrintArray(String[] arr) {
        for (String j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
	String[] arr = new String[] { "aaaaaa", "aaaa", "aaaaaaaaaaa", "aa", "a" };
    	System.out.println("Початковий масив: ");
	PrintArray(arr);
	System.out.println("Посортований масив: ");
	SortByLength(arr);
    }

}
