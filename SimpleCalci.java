import java.util.Scanner;

public class SimpleCalci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /, ^, %): ");
        char operation = scanner.next().charAt(0);
        double result = 0;
        boolean validOperation = true;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                validOperation = false;
                System.out.println("Error: Division by zero.");
            }
        } else if (operation == '^') {
            result = Math.pow(num1, num2);
        } else if (operation == '%') {
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                validOperation = false;
                System.out.println("Error: Division by zero.");
            }
        } else {
            validOperation = false;
            System.out.println("Error: Invalid operation.");
        }
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
