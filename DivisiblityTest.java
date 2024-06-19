import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Checking divisibility by integers from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println("The number " + number + " is divisible by " + i);
            }
        }

        scanner.close();
    }
}