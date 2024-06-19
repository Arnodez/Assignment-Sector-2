import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the marks
        double[] marks = new double[5];
        double sum = 0.0;

        // Asking the student to enter the marks for five units
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            sum += marks[i];
        }

        // Calculating the average
        double average = sum / 5;

        // Displaying the average
        System.out.printf("The average marks are: %.2f\n", average);

        scanner.close();
    }
}s