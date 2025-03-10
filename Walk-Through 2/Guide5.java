import java.util.Scanner;

public class Guide5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            System.out.print("Enter a command (type 'exit' to quit): ");
            input = scanner.nextLine();
            
            if (!input.equalsIgnoreCase("exit")) {
                System.out.println("You entered: " + input);
            }
        } while (!input.equalsIgnoreCase("exit"));
        
        System.out.println("Program terminated.");
        scanner.close();
    }
}