import java.util.Scanner;

public class Task1  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double sum = 0;
        
        System.out.println("Enter 5 student grades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }
        
        double average = sum / 5;
        System.out.println("Average grade: " + average);
        
        scanner.close();
    }
}
