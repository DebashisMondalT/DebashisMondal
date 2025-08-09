import java.util.Scanner;

public class Problem_1 {

    double a;
    double b;
    String operation;

    public Problem_1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation type.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the operation: add or subtract or multiply or divide ");
        String operation = sc.next();

        Problem_1 calc = new Problem_1(a, b, operation);
        System.out.println("Result: " + calc.calculate());
        sc.close();

    }
}
