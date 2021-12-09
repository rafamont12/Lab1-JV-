package Task1;

public class Task1 {
    public static void calc(double a, double b, char operation) {
        switch (operation) {
            case '+':
                System.out.println(a + " " + operation + " " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " " + operation + " " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " " + operation + " " + b + " = " + (a * b));
                break;
            case '/':
                if(b == 0) {
                    System.out.print("На 0 ділити не можна!");
                    return;
                }
                else {
                    System.out.println(a + " " + operation + " " + b + " = " + (a / b));
                }
                break;
            default:
                System.out.print("Ви ввели неправильну операцію!");
                return;
        }
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        char operation = '/';

        System.out.println("Число а: " + a);
        System.out.println("Число b: " + b);
        System.out.println("Операція: " + operation);
        System.out.println();

        calc(a, b, operation);
    }
}
