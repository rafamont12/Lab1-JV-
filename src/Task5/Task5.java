package Task5;

public class Task5 {
    public static void FizzBuzz(int iter) {
        for(int n = 1; n <= iter; n++) {
            if(n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(n % 5 == 0) {
                System.out.println("Buzz");
            }
            else if(n % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz(100);
    }
}
