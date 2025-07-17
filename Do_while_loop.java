import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b, result;

        do {
            System.out.println("\n===== Arithmetic Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                a = sc.nextDouble();
                System.out.print("Enter second number: ");
                b = sc.nextDouble();
            } else {
                a = b = 0;
            }

            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        } while (choice != 5);

        sc.close();
    }
}
