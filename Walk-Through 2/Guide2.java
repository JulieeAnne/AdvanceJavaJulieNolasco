import java.util.Scanner;

public class Guide2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, etc.): ");
        int dayNumber = scanner.nextInt();
        
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid input. Please enter a number between 1 and 7.";
        }
        
        System.out.println("The day is: " + day);
        
        scanner.close();
    }
}
