import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        
        System.out.println("Enter 5 student grades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
            
            if (grades[i] > max) {
                max = grades[i];
            }
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        
        double average = sum / 5;
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);
        
        scanner.close();
    }
}
