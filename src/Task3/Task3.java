package Task3;

public class Task3 {
    public static int UpperLetterAmount(String s) {
        char[] word = s.toCharArray();
        int count = 0;
        for(int i = 0; i < word.length; i++) {
            if(Character.isUpperCase(word[i])) {
                count++;
            }
        }
        return count;
    }

    public static void SortByUpperLetters(String[] arr) {
        int N = arr.length;
        String temp;
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++) {
                if(UpperLetterAmount(arr[j]) > UpperLetterAmount(arr[j + 1])) {
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
        String[] arr = new String[] { "aaAaAa", "aAaA", "AaaaAaaaaaa", "AaaAA", "aAAAA", "aAa" };
        System.out.println("Початковий масив: ");
        PrintArray(arr);
        System.out.println("Посортований масив: ");
        SortByUpperLetters(arr);
    }
}
