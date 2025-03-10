import java.util.Scanner;

public class Task5 {
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
        
        System.out.println("Reversed grades:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(grades[i]);
        }
        
        double[] extraGrades = {88.5, 92.0, 76.5, 85.0, 90.5};
        double[] mergedGrades = new double[grades.length + extraGrades.length];
        
        System.arraycopy(grades, 0, mergedGrades, 0, grades.length);
        System.arraycopy(extraGrades, 0, mergedGrades, grades.length, extraGrades.length);
        
        System.out.println("Merged grades:");
        
        for (double grade : mergedGrades) {
        }
        }
    }
