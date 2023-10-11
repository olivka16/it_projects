package gradle_lab;

public class App {
    public static void main(String[] args) {
        double number1 = 15; 
        double number2 = 3;  

        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiply(number1, number2);
        double quotient = divide(number1, number2);

        System.out.println("Summary: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiply: " + product);
        System.out.println("Division: " + quotient);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; 
        }
        return a / b;
    }
}
